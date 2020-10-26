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

@Tag("29")
class Record_341 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 341: FirstName is Parker")
	void FirstNameOfRecord341() {
		assertEquals("Parker", customers.get(340).getFirstName());
	}

	@Test
	@DisplayName("Record 341: LastName is Brodersen")
	void LastNameOfRecord341() {
		assertEquals("Brodersen", customers.get(340).getLastName());
	}

	@Test
	@DisplayName("Record 341: Company is Grossman, Debra Esq")
	void CompanyOfRecord341() {
		assertEquals("Grossman, Debra Esq", customers.get(340).getCompany());
	}

	@Test
	@DisplayName("Record 341: Address is 2935 N Ontario St")
	void AddressOfRecord341() {
		assertEquals("2935 N Ontario St", customers.get(340).getAddress());
	}

	@Test
	@DisplayName("Record 341: City is Burbank")
	void CityOfRecord341() {
		assertEquals("Burbank", customers.get(340).getCity());
	}

	@Test
	@DisplayName("Record 341: County is Los Angeles")
	void CountyOfRecord341() {
		assertEquals("Los Angeles", customers.get(340).getCounty());
	}

	@Test
	@DisplayName("Record 341: State is CA")
	void StateOfRecord341() {
		assertEquals("CA", customers.get(340).getState());
	}

	@Test
	@DisplayName("Record 341: ZIP is 91504")
	void ZIPOfRecord341() {
		assertEquals("91504", customers.get(340).getZIP());
	}

	@Test
	@DisplayName("Record 341: Phone is 818-845-9751")
	void PhoneOfRecord341() {
		assertEquals("818-845-9751", customers.get(340).getPhone());
	}

	@Test
	@DisplayName("Record 341: Fax is 818-845-8076")
	void FaxOfRecord341() {
		assertEquals("818-845-8076", customers.get(340).getFax());
	}

	@Test
	@DisplayName("Record 341: Email is parker@brodersen.com")
	void EmailOfRecord341() {
		assertEquals("parker@brodersen.com", customers.get(340).getEmail());
	}

	@Test
	@DisplayName("Record 341: Web is http://www.parkerbrodersen.com")
	void WebOfRecord341() {
		assertEquals("http://www.parkerbrodersen.com", customers.get(340).getWeb());
	}
}
