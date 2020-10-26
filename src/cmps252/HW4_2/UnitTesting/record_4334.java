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

@Tag("19")
class Record_4334 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4334: FirstName is Edison")
	void FirstNameOfRecord4334() {
		assertEquals("Edison", customers.get(4333).getFirstName());
	}

	@Test
	@DisplayName("Record 4334: LastName is Pasculli")
	void LastNameOfRecord4334() {
		assertEquals("Pasculli", customers.get(4333).getLastName());
	}

	@Test
	@DisplayName("Record 4334: Company is ychorn, John")
	void CompanyOfRecord4334() {
		assertEquals("ychorn, John", customers.get(4333).getCompany());
	}

	@Test
	@DisplayName("Record 4334: Address is 1857 3rd St Nw")
	void AddressOfRecord4334() {
		assertEquals("1857 3rd St Nw", customers.get(4333).getAddress());
	}

	@Test
	@DisplayName("Record 4334: City is Washington")
	void CityOfRecord4334() {
		assertEquals("Washington", customers.get(4333).getCity());
	}

	@Test
	@DisplayName("Record 4334: County is District of Columbia")
	void CountyOfRecord4334() {
		assertEquals("District of Columbia", customers.get(4333).getCounty());
	}

	@Test
	@DisplayName("Record 4334: State is DC")
	void StateOfRecord4334() {
		assertEquals("DC", customers.get(4333).getState());
	}

	@Test
	@DisplayName("Record 4334: ZIP is 20001")
	void ZIPOfRecord4334() {
		assertEquals("20001", customers.get(4333).getZIP());
	}

	@Test
	@DisplayName("Record 4334: Phone is 202-234-7626")
	void PhoneOfRecord4334() {
		assertEquals("202-234-7626", customers.get(4333).getPhone());
	}

	@Test
	@DisplayName("Record 4334: Fax is 202-234-1468")
	void FaxOfRecord4334() {
		assertEquals("202-234-1468", customers.get(4333).getFax());
	}

	@Test
	@DisplayName("Record 4334: Email is edison@pasculli.com")
	void EmailOfRecord4334() {
		assertEquals("edison@pasculli.com", customers.get(4333).getEmail());
	}

	@Test
	@DisplayName("Record 4334: Web is http://www.edisonpasculli.com")
	void WebOfRecord4334() {
		assertEquals("http://www.edisonpasculli.com", customers.get(4333).getWeb());
	}
}
