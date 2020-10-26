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

@Tag("28")
class Record_1729 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1729: FirstName is Michelle")
	void FirstNameOfRecord1729() {
		assertEquals("Michelle", customers.get(1728).getFirstName());
	}

	@Test
	@DisplayName("Record 1729: LastName is Scroggin")
	void LastNameOfRecord1729() {
		assertEquals("Scroggin", customers.get(1728).getLastName());
	}

	@Test
	@DisplayName("Record 1729: Company is Parallel Design Inc")
	void CompanyOfRecord1729() {
		assertEquals("Parallel Design Inc", customers.get(1728).getCompany());
	}

	@Test
	@DisplayName("Record 1729: Address is 8719 Canby Ave")
	void AddressOfRecord1729() {
		assertEquals("8719 Canby Ave", customers.get(1728).getAddress());
	}

	@Test
	@DisplayName("Record 1729: City is Northridge")
	void CityOfRecord1729() {
		assertEquals("Northridge", customers.get(1728).getCity());
	}

	@Test
	@DisplayName("Record 1729: County is Los Angeles")
	void CountyOfRecord1729() {
		assertEquals("Los Angeles", customers.get(1728).getCounty());
	}

	@Test
	@DisplayName("Record 1729: State is CA")
	void StateOfRecord1729() {
		assertEquals("CA", customers.get(1728).getState());
	}

	@Test
	@DisplayName("Record 1729: ZIP is 91325")
	void ZIPOfRecord1729() {
		assertEquals("91325", customers.get(1728).getZIP());
	}

	@Test
	@DisplayName("Record 1729: Phone is 818-993-5775")
	void PhoneOfRecord1729() {
		assertEquals("818-993-5775", customers.get(1728).getPhone());
	}

	@Test
	@DisplayName("Record 1729: Fax is 818-993-4118")
	void FaxOfRecord1729() {
		assertEquals("818-993-4118", customers.get(1728).getFax());
	}

	@Test
	@DisplayName("Record 1729: Email is michelle@scroggin.com")
	void EmailOfRecord1729() {
		assertEquals("michelle@scroggin.com", customers.get(1728).getEmail());
	}

	@Test
	@DisplayName("Record 1729: Web is http://www.michellescroggin.com")
	void WebOfRecord1729() {
		assertEquals("http://www.michellescroggin.com", customers.get(1728).getWeb());
	}
}
