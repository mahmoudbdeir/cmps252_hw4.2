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
class Record_3152 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3152: FirstName is Mariano")
	void FirstNameOfRecord3152() {
		assertEquals("Mariano", customers.get(3151).getFirstName());
	}

	@Test
	@DisplayName("Record 3152: LastName is Murin")
	void LastNameOfRecord3152() {
		assertEquals("Murin", customers.get(3151).getLastName());
	}

	@Test
	@DisplayName("Record 3152: Company is Heller, Joyce Z Esq")
	void CompanyOfRecord3152() {
		assertEquals("Heller, Joyce Z Esq", customers.get(3151).getCompany());
	}

	@Test
	@DisplayName("Record 3152: Address is 68 Main St")
	void AddressOfRecord3152() {
		assertEquals("68 Main St", customers.get(3151).getAddress());
	}

	@Test
	@DisplayName("Record 3152: City is South Bound Brook")
	void CityOfRecord3152() {
		assertEquals("South Bound Brook", customers.get(3151).getCity());
	}

	@Test
	@DisplayName("Record 3152: County is Somerset")
	void CountyOfRecord3152() {
		assertEquals("Somerset", customers.get(3151).getCounty());
	}

	@Test
	@DisplayName("Record 3152: State is NJ")
	void StateOfRecord3152() {
		assertEquals("NJ", customers.get(3151).getState());
	}

	@Test
	@DisplayName("Record 3152: ZIP is 8880")
	void ZIPOfRecord3152() {
		assertEquals("8880", customers.get(3151).getZIP());
	}

	@Test
	@DisplayName("Record 3152: Phone is 732-469-3546")
	void PhoneOfRecord3152() {
		assertEquals("732-469-3546", customers.get(3151).getPhone());
	}

	@Test
	@DisplayName("Record 3152: Fax is 732-469-8642")
	void FaxOfRecord3152() {
		assertEquals("732-469-8642", customers.get(3151).getFax());
	}

	@Test
	@DisplayName("Record 3152: Email is mariano@murin.com")
	void EmailOfRecord3152() {
		assertEquals("mariano@murin.com", customers.get(3151).getEmail());
	}

	@Test
	@DisplayName("Record 3152: Web is http://www.marianomurin.com")
	void WebOfRecord3152() {
		assertEquals("http://www.marianomurin.com", customers.get(3151).getWeb());
	}
}
