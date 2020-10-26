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

@Tag("23")
class Record_4962 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4962: FirstName is Sang")
	void FirstNameOfRecord4962() {
		assertEquals("Sang", customers.get(4961).getFirstName());
	}

	@Test
	@DisplayName("Record 4962: LastName is Ludtke")
	void LastNameOfRecord4962() {
		assertEquals("Ludtke", customers.get(4961).getLastName());
	}

	@Test
	@DisplayName("Record 4962: Company is Boston Stoker")
	void CompanyOfRecord4962() {
		assertEquals("Boston Stoker", customers.get(4961).getCompany());
	}

	@Test
	@DisplayName("Record 4962: Address is 184 Ne 72nd St")
	void AddressOfRecord4962() {
		assertEquals("184 Ne 72nd St", customers.get(4961).getAddress());
	}

	@Test
	@DisplayName("Record 4962: City is Kansas City")
	void CityOfRecord4962() {
		assertEquals("Kansas City", customers.get(4961).getCity());
	}

	@Test
	@DisplayName("Record 4962: County is Clay")
	void CountyOfRecord4962() {
		assertEquals("Clay", customers.get(4961).getCounty());
	}

	@Test
	@DisplayName("Record 4962: State is MO")
	void StateOfRecord4962() {
		assertEquals("MO", customers.get(4961).getState());
	}

	@Test
	@DisplayName("Record 4962: ZIP is 64118")
	void ZIPOfRecord4962() {
		assertEquals("64118", customers.get(4961).getZIP());
	}

	@Test
	@DisplayName("Record 4962: Phone is 816-436-2295")
	void PhoneOfRecord4962() {
		assertEquals("816-436-2295", customers.get(4961).getPhone());
	}

	@Test
	@DisplayName("Record 4962: Fax is 816-436-1118")
	void FaxOfRecord4962() {
		assertEquals("816-436-1118", customers.get(4961).getFax());
	}

	@Test
	@DisplayName("Record 4962: Email is sang@ludtke.com")
	void EmailOfRecord4962() {
		assertEquals("sang@ludtke.com", customers.get(4961).getEmail());
	}

	@Test
	@DisplayName("Record 4962: Web is http://www.sangludtke.com")
	void WebOfRecord4962() {
		assertEquals("http://www.sangludtke.com", customers.get(4961).getWeb());
	}
}
