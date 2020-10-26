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

@Tag("30")
class Record_1071 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1071: FirstName is Bess")
	void FirstNameOfRecord1071() {
		assertEquals("Bess", customers.get(1070).getFirstName());
	}

	@Test
	@DisplayName("Record 1071: LastName is Moro")
	void LastNameOfRecord1071() {
		assertEquals("Moro", customers.get(1070).getLastName());
	}

	@Test
	@DisplayName("Record 1071: Company is Residence Inn By Marriott")
	void CompanyOfRecord1071() {
		assertEquals("Residence Inn By Marriott", customers.get(1070).getCompany());
	}

	@Test
	@DisplayName("Record 1071: Address is 1101 I Elmwood Ave")
	void AddressOfRecord1071() {
		assertEquals("1101 I Elmwood Ave", customers.get(1070).getAddress());
	}

	@Test
	@DisplayName("Record 1071: City is Columbia")
	void CityOfRecord1071() {
		assertEquals("Columbia", customers.get(1070).getCity());
	}

	@Test
	@DisplayName("Record 1071: County is Richland")
	void CountyOfRecord1071() {
		assertEquals("Richland", customers.get(1070).getCounty());
	}

	@Test
	@DisplayName("Record 1071: State is SC")
	void StateOfRecord1071() {
		assertEquals("SC", customers.get(1070).getState());
	}

	@Test
	@DisplayName("Record 1071: ZIP is 29201")
	void ZIPOfRecord1071() {
		assertEquals("29201", customers.get(1070).getZIP());
	}

	@Test
	@DisplayName("Record 1071: Phone is 803-252-1299")
	void PhoneOfRecord1071() {
		assertEquals("803-252-1299", customers.get(1070).getPhone());
	}

	@Test
	@DisplayName("Record 1071: Fax is 803-252-3408")
	void FaxOfRecord1071() {
		assertEquals("803-252-3408", customers.get(1070).getFax());
	}

	@Test
	@DisplayName("Record 1071: Email is bess@moro.com")
	void EmailOfRecord1071() {
		assertEquals("bess@moro.com", customers.get(1070).getEmail());
	}

	@Test
	@DisplayName("Record 1071: Web is http://www.bessmoro.com")
	void WebOfRecord1071() {
		assertEquals("http://www.bessmoro.com", customers.get(1070).getWeb());
	}
}
