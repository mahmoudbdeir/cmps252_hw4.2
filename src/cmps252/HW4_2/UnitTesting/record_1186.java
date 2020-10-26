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
class Record_1186 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1186: FirstName is Adrian")
	void FirstNameOfRecord1186() {
		assertEquals("Adrian", customers.get(1185).getFirstName());
	}

	@Test
	@DisplayName("Record 1186: LastName is Bread")
	void LastNameOfRecord1186() {
		assertEquals("Bread", customers.get(1185).getLastName());
	}

	@Test
	@DisplayName("Record 1186: Company is Us Cane Sug Refiners Assn")
	void CompanyOfRecord1186() {
		assertEquals("Us Cane Sug Refiners Assn", customers.get(1185).getCompany());
	}

	@Test
	@DisplayName("Record 1186: Address is 3988 Flowers Rd  #-690")
	void AddressOfRecord1186() {
		assertEquals("3988 Flowers Rd  #-690", customers.get(1185).getAddress());
	}

	@Test
	@DisplayName("Record 1186: City is Atlanta")
	void CityOfRecord1186() {
		assertEquals("Atlanta", customers.get(1185).getCity());
	}

	@Test
	@DisplayName("Record 1186: County is Dekalb")
	void CountyOfRecord1186() {
		assertEquals("Dekalb", customers.get(1185).getCounty());
	}

	@Test
	@DisplayName("Record 1186: State is GA")
	void StateOfRecord1186() {
		assertEquals("GA", customers.get(1185).getState());
	}

	@Test
	@DisplayName("Record 1186: ZIP is 30360")
	void ZIPOfRecord1186() {
		assertEquals("30360", customers.get(1185).getZIP());
	}

	@Test
	@DisplayName("Record 1186: Phone is 770-455-4816")
	void PhoneOfRecord1186() {
		assertEquals("770-455-4816", customers.get(1185).getPhone());
	}

	@Test
	@DisplayName("Record 1186: Fax is 770-455-2052")
	void FaxOfRecord1186() {
		assertEquals("770-455-2052", customers.get(1185).getFax());
	}

	@Test
	@DisplayName("Record 1186: Email is adrian@bread.com")
	void EmailOfRecord1186() {
		assertEquals("adrian@bread.com", customers.get(1185).getEmail());
	}

	@Test
	@DisplayName("Record 1186: Web is http://www.adrianbread.com")
	void WebOfRecord1186() {
		assertEquals("http://www.adrianbread.com", customers.get(1185).getWeb());
	}
}
