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

@Tag("39")
class Record_547 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 547: FirstName is Robbie")
	void FirstNameOfRecord547() {
		assertEquals("Robbie", customers.get(546).getFirstName());
	}

	@Test
	@DisplayName("Record 547: LastName is Poli")
	void LastNameOfRecord547() {
		assertEquals("Poli", customers.get(546).getLastName());
	}

	@Test
	@DisplayName("Record 547: Company is Ped Manufacturing Ltd")
	void CompanyOfRecord547() {
		assertEquals("Ped Manufacturing Ltd", customers.get(546).getCompany());
	}

	@Test
	@DisplayName("Record 547: Address is 125 Castle Rd")
	void AddressOfRecord547() {
		assertEquals("125 Castle Rd", customers.get(546).getAddress());
	}

	@Test
	@DisplayName("Record 547: City is Secaucus")
	void CityOfRecord547() {
		assertEquals("Secaucus", customers.get(546).getCity());
	}

	@Test
	@DisplayName("Record 547: County is Hudson")
	void CountyOfRecord547() {
		assertEquals("Hudson", customers.get(546).getCounty());
	}

	@Test
	@DisplayName("Record 547: State is NJ")
	void StateOfRecord547() {
		assertEquals("NJ", customers.get(546).getState());
	}

	@Test
	@DisplayName("Record 547: ZIP is 7094")
	void ZIPOfRecord547() {
		assertEquals("7094", customers.get(546).getZIP());
	}

	@Test
	@DisplayName("Record 547: Phone is 201-866-9115")
	void PhoneOfRecord547() {
		assertEquals("201-866-9115", customers.get(546).getPhone());
	}

	@Test
	@DisplayName("Record 547: Fax is 201-866-9574")
	void FaxOfRecord547() {
		assertEquals("201-866-9574", customers.get(546).getFax());
	}

	@Test
	@DisplayName("Record 547: Email is robbie@poli.com")
	void EmailOfRecord547() {
		assertEquals("robbie@poli.com", customers.get(546).getEmail());
	}

	@Test
	@DisplayName("Record 547: Web is http://www.robbiepoli.com")
	void WebOfRecord547() {
		assertEquals("http://www.robbiepoli.com", customers.get(546).getWeb());
	}
}
