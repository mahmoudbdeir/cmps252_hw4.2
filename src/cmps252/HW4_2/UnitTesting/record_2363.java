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
class Record_2363 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2363: FirstName is Justine")
	void FirstNameOfRecord2363() {
		assertEquals("Justine", customers.get(2362).getFirstName());
	}

	@Test
	@DisplayName("Record 2363: LastName is Runner")
	void LastNameOfRecord2363() {
		assertEquals("Runner", customers.get(2362).getLastName());
	}

	@Test
	@DisplayName("Record 2363: Company is Jackman, Mark I Esq")
	void CompanyOfRecord2363() {
		assertEquals("Jackman, Mark I Esq", customers.get(2362).getCompany());
	}

	@Test
	@DisplayName("Record 2363: Address is 1123 E Kansas Plz")
	void AddressOfRecord2363() {
		assertEquals("1123 E Kansas Plz", customers.get(2362).getAddress());
	}

	@Test
	@DisplayName("Record 2363: City is Garden City")
	void CityOfRecord2363() {
		assertEquals("Garden City", customers.get(2362).getCity());
	}

	@Test
	@DisplayName("Record 2363: County is Finney")
	void CountyOfRecord2363() {
		assertEquals("Finney", customers.get(2362).getCounty());
	}

	@Test
	@DisplayName("Record 2363: State is KS")
	void StateOfRecord2363() {
		assertEquals("KS", customers.get(2362).getState());
	}

	@Test
	@DisplayName("Record 2363: ZIP is 67846")
	void ZIPOfRecord2363() {
		assertEquals("67846", customers.get(2362).getZIP());
	}

	@Test
	@DisplayName("Record 2363: Phone is 620-276-9378")
	void PhoneOfRecord2363() {
		assertEquals("620-276-9378", customers.get(2362).getPhone());
	}

	@Test
	@DisplayName("Record 2363: Fax is 620-276-9871")
	void FaxOfRecord2363() {
		assertEquals("620-276-9871", customers.get(2362).getFax());
	}

	@Test
	@DisplayName("Record 2363: Email is justine@runner.com")
	void EmailOfRecord2363() {
		assertEquals("justine@runner.com", customers.get(2362).getEmail());
	}

	@Test
	@DisplayName("Record 2363: Web is http://www.justinerunner.com")
	void WebOfRecord2363() {
		assertEquals("http://www.justinerunner.com", customers.get(2362).getWeb());
	}
}
