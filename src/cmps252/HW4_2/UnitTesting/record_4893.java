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

@Tag("24")
class Record_4893 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4893: FirstName is Erik")
	void FirstNameOfRecord4893() {
		assertEquals("Erik", customers.get(4892).getFirstName());
	}

	@Test
	@DisplayName("Record 4893: LastName is Chappelear")
	void LastNameOfRecord4893() {
		assertEquals("Chappelear", customers.get(4892).getLastName());
	}

	@Test
	@DisplayName("Record 4893: Company is Rohloff, Frederick J Esq")
	void CompanyOfRecord4893() {
		assertEquals("Rohloff, Frederick J Esq", customers.get(4892).getCompany());
	}

	@Test
	@DisplayName("Record 4893: Address is 7095 Black Horse Pike")
	void AddressOfRecord4893() {
		assertEquals("7095 Black Horse Pike", customers.get(4892).getAddress());
	}

	@Test
	@DisplayName("Record 4893: City is Pleasantville")
	void CityOfRecord4893() {
		assertEquals("Pleasantville", customers.get(4892).getCity());
	}

	@Test
	@DisplayName("Record 4893: County is Atlantic")
	void CountyOfRecord4893() {
		assertEquals("Atlantic", customers.get(4892).getCounty());
	}

	@Test
	@DisplayName("Record 4893: State is NJ")
	void StateOfRecord4893() {
		assertEquals("NJ", customers.get(4892).getState());
	}

	@Test
	@DisplayName("Record 4893: ZIP is 08232")
	void ZIPOfRecord4893() {
		assertEquals("08232", customers.get(4892).getZIP());
	}

	@Test
	@DisplayName("Record 4893: Phone is 609-645-2833")
	void PhoneOfRecord4893() {
		assertEquals("609-645-2833", customers.get(4892).getPhone());
	}

	@Test
	@DisplayName("Record 4893: Fax is 609-645-4507")
	void FaxOfRecord4893() {
		assertEquals("609-645-4507", customers.get(4892).getFax());
	}

	@Test
	@DisplayName("Record 4893: Email is erik@chappelear.com")
	void EmailOfRecord4893() {
		assertEquals("erik@chappelear.com", customers.get(4892).getEmail());
	}

	@Test
	@DisplayName("Record 4893: Web is http://www.erikchappelear.com")
	void WebOfRecord4893() {
		assertEquals("http://www.erikchappelear.com", customers.get(4892).getWeb());
	}
}
