package cmps252.HW4_2.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

@Tag("35")
class Record_1398 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1398: FirstName is Elizabeth")
	void FirstNameOfRecord1398() {
		assertEquals("Elizabeth", customers.get(1397).getFirstName());
	}

	@Test
	@DisplayName("Record 1398: LastName is Branstad")
	void LastNameOfRecord1398() {
		assertEquals("Branstad", customers.get(1397).getLastName());
	}

	@Test
	@DisplayName("Record 1398: Company is Progressive Marketing Grp Inc")
	void CompanyOfRecord1398() {
		assertEquals("Progressive Marketing Grp Inc", customers.get(1397).getCompany());
	}

	@Test
	@DisplayName("Record 1398: Address is 235 9th Ave N")
	void AddressOfRecord1398() {
		assertEquals("235 9th Ave N", customers.get(1397).getAddress());
	}

	@Test
	@DisplayName("Record 1398: City is Seattle")
	void CityOfRecord1398() {
		assertEquals("Seattle", customers.get(1397).getCity());
	}

	@Test
	@DisplayName("Record 1398: County is King")
	void CountyOfRecord1398() {
		assertEquals("King", customers.get(1397).getCounty());
	}

	@Test
	@DisplayName("Record 1398: State is WA")
	void StateOfRecord1398() {
		assertEquals("WA", customers.get(1397).getState());
	}

	@Test
	@DisplayName("Record 1398: ZIP is 98109")
	void ZIPOfRecord1398() {
		assertEquals("98109", customers.get(1397).getZIP());
	}

	@Test
	@DisplayName("Record 1398: Phone is 206-224-7503")
	void PhoneOfRecord1398() {
		assertEquals("206-224-7503", customers.get(1397).getPhone());
	}

	@Test
	@DisplayName("Record 1398: Fax is 206-224-4592")
	void FaxOfRecord1398() {
		assertEquals("206-224-4592", customers.get(1397).getFax());
	}

	@Test
	@DisplayName("Record 1398: Email is elizabeth@branstad.com")
	void EmailOfRecord1398() {
		assertEquals("elizabeth@branstad.com", customers.get(1397).getEmail());
	}

	@Test
	@DisplayName("Record 1398: Web is http://www.elizabethbranstad.com")
	void WebOfRecord1398() {
		assertEquals("http://www.elizabethbranstad.com", customers.get(1397).getWeb());
	}
}
