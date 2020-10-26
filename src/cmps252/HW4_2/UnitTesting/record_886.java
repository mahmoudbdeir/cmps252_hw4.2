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

@Tag("20")
class Record_886 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 886: FirstName is Donovan")
	void FirstNameOfRecord886() {
		assertEquals("Donovan", customers.get(885).getFirstName());
	}

	@Test
	@DisplayName("Record 886: LastName is Belles")
	void LastNameOfRecord886() {
		assertEquals("Belles", customers.get(885).getLastName());
	}

	@Test
	@DisplayName("Record 886: Company is Brown, Robert J Esq")
	void CompanyOfRecord886() {
		assertEquals("Brown, Robert J Esq", customers.get(885).getCompany());
	}

	@Test
	@DisplayName("Record 886: Address is 391 Danforth Ave")
	void AddressOfRecord886() {
		assertEquals("391 Danforth Ave", customers.get(885).getAddress());
	}

	@Test
	@DisplayName("Record 886: City is Jersey City")
	void CityOfRecord886() {
		assertEquals("Jersey City", customers.get(885).getCity());
	}

	@Test
	@DisplayName("Record 886: County is Hudson")
	void CountyOfRecord886() {
		assertEquals("Hudson", customers.get(885).getCounty());
	}

	@Test
	@DisplayName("Record 886: State is NJ")
	void StateOfRecord886() {
		assertEquals("NJ", customers.get(885).getState());
	}

	@Test
	@DisplayName("Record 886: ZIP is 7305")
	void ZIPOfRecord886() {
		assertEquals("7305", customers.get(885).getZIP());
	}

	@Test
	@DisplayName("Record 886: Phone is 201-200-0386")
	void PhoneOfRecord886() {
		assertEquals("201-200-0386", customers.get(885).getPhone());
	}

	@Test
	@DisplayName("Record 886: Fax is 201-200-3401")
	void FaxOfRecord886() {
		assertEquals("201-200-3401", customers.get(885).getFax());
	}

	@Test
	@DisplayName("Record 886: Email is donovan@belles.com")
	void EmailOfRecord886() {
		assertEquals("donovan@belles.com", customers.get(885).getEmail());
	}

	@Test
	@DisplayName("Record 886: Web is http://www.donovanbelles.com")
	void WebOfRecord886() {
		assertEquals("http://www.donovanbelles.com", customers.get(885).getWeb());
	}
}
