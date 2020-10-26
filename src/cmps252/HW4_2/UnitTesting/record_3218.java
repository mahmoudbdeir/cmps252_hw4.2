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

@Tag("13")
class Record_3218 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3218: FirstName is Britney")
	void FirstNameOfRecord3218() {
		assertEquals("Britney", customers.get(3217).getFirstName());
	}

	@Test
	@DisplayName("Record 3218: LastName is Comp")
	void LastNameOfRecord3218() {
		assertEquals("Comp", customers.get(3217).getLastName());
	}

	@Test
	@DisplayName("Record 3218: Company is Arizona Bag & Burlap Co Inc")
	void CompanyOfRecord3218() {
		assertEquals("Arizona Bag & Burlap Co Inc", customers.get(3217).getCompany());
	}

	@Test
	@DisplayName("Record 3218: Address is 1000 E 80th Pl")
	void AddressOfRecord3218() {
		assertEquals("1000 E 80th Pl", customers.get(3217).getAddress());
	}

	@Test
	@DisplayName("Record 3218: City is Merrillville")
	void CityOfRecord3218() {
		assertEquals("Merrillville", customers.get(3217).getCity());
	}

	@Test
	@DisplayName("Record 3218: County is Lake")
	void CountyOfRecord3218() {
		assertEquals("Lake", customers.get(3217).getCounty());
	}

	@Test
	@DisplayName("Record 3218: State is IN")
	void StateOfRecord3218() {
		assertEquals("IN", customers.get(3217).getState());
	}

	@Test
	@DisplayName("Record 3218: ZIP is 46410")
	void ZIPOfRecord3218() {
		assertEquals("46410", customers.get(3217).getZIP());
	}

	@Test
	@DisplayName("Record 3218: Phone is 219-769-8173")
	void PhoneOfRecord3218() {
		assertEquals("219-769-8173", customers.get(3217).getPhone());
	}

	@Test
	@DisplayName("Record 3218: Fax is 219-769-4544")
	void FaxOfRecord3218() {
		assertEquals("219-769-4544", customers.get(3217).getFax());
	}

	@Test
	@DisplayName("Record 3218: Email is britney@comp.com")
	void EmailOfRecord3218() {
		assertEquals("britney@comp.com", customers.get(3217).getEmail());
	}

	@Test
	@DisplayName("Record 3218: Web is http://www.britneycomp.com")
	void WebOfRecord3218() {
		assertEquals("http://www.britneycomp.com", customers.get(3217).getWeb());
	}
}
