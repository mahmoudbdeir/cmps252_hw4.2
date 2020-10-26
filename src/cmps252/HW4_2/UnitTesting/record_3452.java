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

@Tag("46")
class Record_3452 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3452: FirstName is Norberto")
	void FirstNameOfRecord3452() {
		assertEquals("Norberto", customers.get(3451).getFirstName());
	}

	@Test
	@DisplayName("Record 3452: LastName is Mirabelli")
	void LastNameOfRecord3452() {
		assertEquals("Mirabelli", customers.get(3451).getLastName());
	}

	@Test
	@DisplayName("Record 3452: Company is Buckley Powder Company")
	void CompanyOfRecord3452() {
		assertEquals("Buckley Powder Company", customers.get(3451).getCompany());
	}

	@Test
	@DisplayName("Record 3452: Address is 1133 May St")
	void AddressOfRecord3452() {
		assertEquals("1133 May St", customers.get(3451).getAddress());
	}

	@Test
	@DisplayName("Record 3452: City is Lansing")
	void CityOfRecord3452() {
		assertEquals("Lansing", customers.get(3451).getCity());
	}

	@Test
	@DisplayName("Record 3452: County is Ingham")
	void CountyOfRecord3452() {
		assertEquals("Ingham", customers.get(3451).getCounty());
	}

	@Test
	@DisplayName("Record 3452: State is MI")
	void StateOfRecord3452() {
		assertEquals("MI", customers.get(3451).getState());
	}

	@Test
	@DisplayName("Record 3452: ZIP is 48906")
	void ZIPOfRecord3452() {
		assertEquals("48906", customers.get(3451).getZIP());
	}

	@Test
	@DisplayName("Record 3452: Phone is 517-372-2000")
	void PhoneOfRecord3452() {
		assertEquals("517-372-2000", customers.get(3451).getPhone());
	}

	@Test
	@DisplayName("Record 3452: Fax is 517-372-5233")
	void FaxOfRecord3452() {
		assertEquals("517-372-5233", customers.get(3451).getFax());
	}

	@Test
	@DisplayName("Record 3452: Email is norberto@mirabelli.com")
	void EmailOfRecord3452() {
		assertEquals("norberto@mirabelli.com", customers.get(3451).getEmail());
	}

	@Test
	@DisplayName("Record 3452: Web is http://www.norbertomirabelli.com")
	void WebOfRecord3452() {
		assertEquals("http://www.norbertomirabelli.com", customers.get(3451).getWeb());
	}
}
