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

@Tag("21")
class Record_2575 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2575: FirstName is Ariel")
	void FirstNameOfRecord2575() {
		assertEquals("Ariel", customers.get(2574).getFirstName());
	}

	@Test
	@DisplayName("Record 2575: LastName is Schulwys")
	void LastNameOfRecord2575() {
		assertEquals("Schulwys", customers.get(2574).getLastName());
	}

	@Test
	@DisplayName("Record 2575: Company is Alvey Pan Washers")
	void CompanyOfRecord2575() {
		assertEquals("Alvey Pan Washers", customers.get(2574).getCompany());
	}

	@Test
	@DisplayName("Record 2575: Address is 4802 S 33rd St")
	void AddressOfRecord2575() {
		assertEquals("4802 S 33rd St", customers.get(2574).getAddress());
	}

	@Test
	@DisplayName("Record 2575: City is Phoenix")
	void CityOfRecord2575() {
		assertEquals("Phoenix", customers.get(2574).getCity());
	}

	@Test
	@DisplayName("Record 2575: County is Maricopa")
	void CountyOfRecord2575() {
		assertEquals("Maricopa", customers.get(2574).getCounty());
	}

	@Test
	@DisplayName("Record 2575: State is AZ")
	void StateOfRecord2575() {
		assertEquals("AZ", customers.get(2574).getState());
	}

	@Test
	@DisplayName("Record 2575: ZIP is 85040")
	void ZIPOfRecord2575() {
		assertEquals("85040", customers.get(2574).getZIP());
	}

	@Test
	@DisplayName("Record 2575: Phone is 602-268-6812")
	void PhoneOfRecord2575() {
		assertEquals("602-268-6812", customers.get(2574).getPhone());
	}

	@Test
	@DisplayName("Record 2575: Fax is 602-268-3538")
	void FaxOfRecord2575() {
		assertEquals("602-268-3538", customers.get(2574).getFax());
	}

	@Test
	@DisplayName("Record 2575: Email is ariel@schulwys.com")
	void EmailOfRecord2575() {
		assertEquals("ariel@schulwys.com", customers.get(2574).getEmail());
	}

	@Test
	@DisplayName("Record 2575: Web is http://www.arielschulwys.com")
	void WebOfRecord2575() {
		assertEquals("http://www.arielschulwys.com", customers.get(2574).getWeb());
	}
}
