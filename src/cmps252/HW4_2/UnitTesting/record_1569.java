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

@Tag("19")
class Record_1569 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1569: FirstName is Bobbi")
	void FirstNameOfRecord1569() {
		assertEquals("Bobbi", customers.get(1568).getFirstName());
	}

	@Test
	@DisplayName("Record 1569: LastName is Caposole")
	void LastNameOfRecord1569() {
		assertEquals("Caposole", customers.get(1568).getLastName());
	}

	@Test
	@DisplayName("Record 1569: Company is Butlers Of Far Hills Inc")
	void CompanyOfRecord1569() {
		assertEquals("Butlers Of Far Hills Inc", customers.get(1568).getCompany());
	}

	@Test
	@DisplayName("Record 1569: Address is 369 Passaic Ave")
	void AddressOfRecord1569() {
		assertEquals("369 Passaic Ave", customers.get(1568).getAddress());
	}

	@Test
	@DisplayName("Record 1569: City is Fairfield")
	void CityOfRecord1569() {
		assertEquals("Fairfield", customers.get(1568).getCity());
	}

	@Test
	@DisplayName("Record 1569: County is Essex")
	void CountyOfRecord1569() {
		assertEquals("Essex", customers.get(1568).getCounty());
	}

	@Test
	@DisplayName("Record 1569: State is NJ")
	void StateOfRecord1569() {
		assertEquals("NJ", customers.get(1568).getState());
	}

	@Test
	@DisplayName("Record 1569: ZIP is 7004")
	void ZIPOfRecord1569() {
		assertEquals("7004", customers.get(1568).getZIP());
	}

	@Test
	@DisplayName("Record 1569: Phone is 973-808-1974")
	void PhoneOfRecord1569() {
		assertEquals("973-808-1974", customers.get(1568).getPhone());
	}

	@Test
	@DisplayName("Record 1569: Fax is 973-808-4342")
	void FaxOfRecord1569() {
		assertEquals("973-808-4342", customers.get(1568).getFax());
	}

	@Test
	@DisplayName("Record 1569: Email is bobbi@caposole.com")
	void EmailOfRecord1569() {
		assertEquals("bobbi@caposole.com", customers.get(1568).getEmail());
	}

	@Test
	@DisplayName("Record 1569: Web is http://www.bobbicaposole.com")
	void WebOfRecord1569() {
		assertEquals("http://www.bobbicaposole.com", customers.get(1568).getWeb());
	}
}
