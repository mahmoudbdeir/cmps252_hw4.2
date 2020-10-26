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

@Tag("15")
class Record_53 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 53: FirstName is Alecia")
	void FirstNameOfRecord53() {
		assertEquals("Alecia", customers.get(52).getFirstName());
	}

	@Test
	@DisplayName("Record 53: LastName is Krance")
	void LastNameOfRecord53() {
		assertEquals("Krance", customers.get(52).getLastName());
	}

	@Test
	@DisplayName("Record 53: Company is Lenweaver, Thomas E Esq")
	void CompanyOfRecord53() {
		assertEquals("Lenweaver, Thomas E Esq", customers.get(52).getCompany());
	}

	@Test
	@DisplayName("Record 53: Address is 1000 S Broad St")
	void AddressOfRecord53() {
		assertEquals("1000 S Broad St", customers.get(52).getAddress());
	}

	@Test
	@DisplayName("Record 53: City is Philadelphia")
	void CityOfRecord53() {
		assertEquals("Philadelphia", customers.get(52).getCity());
	}

	@Test
	@DisplayName("Record 53: County is Philadelphia")
	void CountyOfRecord53() {
		assertEquals("Philadelphia", customers.get(52).getCounty());
	}

	@Test
	@DisplayName("Record 53: State is PA")
	void StateOfRecord53() {
		assertEquals("PA", customers.get(52).getState());
	}

	@Test
	@DisplayName("Record 53: ZIP is 19146")
	void ZIPOfRecord53() {
		assertEquals("19146", customers.get(52).getZIP());
	}

	@Test
	@DisplayName("Record 53: Phone is 215-735-0485")
	void PhoneOfRecord53() {
		assertEquals("215-735-0485", customers.get(52).getPhone());
	}

	@Test
	@DisplayName("Record 53: Fax is 215-735-2655")
	void FaxOfRecord53() {
		assertEquals("215-735-2655", customers.get(52).getFax());
	}

	@Test
	@DisplayName("Record 53: Email is alecia@krance.com")
	void EmailOfRecord53() {
		assertEquals("alecia@krance.com", customers.get(52).getEmail());
	}

	@Test
	@DisplayName("Record 53: Web is http://www.aleciakrance.com")
	void WebOfRecord53() {
		assertEquals("http://www.aleciakrance.com", customers.get(52).getWeb());
	}
}
