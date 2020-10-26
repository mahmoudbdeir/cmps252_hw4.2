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
class Record_3919 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3919: FirstName is Louis")
	void FirstNameOfRecord3919() {
		assertEquals("Louis", customers.get(3918).getFirstName());
	}

	@Test
	@DisplayName("Record 3919: LastName is Schauf")
	void LastNameOfRecord3919() {
		assertEquals("Schauf", customers.get(3918).getLastName());
	}

	@Test
	@DisplayName("Record 3919: Company is Gray Purvis & Company Cpa")
	void CompanyOfRecord3919() {
		assertEquals("Gray Purvis & Company Cpa", customers.get(3918).getCompany());
	}

	@Test
	@DisplayName("Record 3919: Address is 685 Bloomfield Ave")
	void AddressOfRecord3919() {
		assertEquals("685 Bloomfield Ave", customers.get(3918).getAddress());
	}

	@Test
	@DisplayName("Record 3919: City is Verona")
	void CityOfRecord3919() {
		assertEquals("Verona", customers.get(3918).getCity());
	}

	@Test
	@DisplayName("Record 3919: County is Essex")
	void CountyOfRecord3919() {
		assertEquals("Essex", customers.get(3918).getCounty());
	}

	@Test
	@DisplayName("Record 3919: State is NJ")
	void StateOfRecord3919() {
		assertEquals("NJ", customers.get(3918).getState());
	}

	@Test
	@DisplayName("Record 3919: ZIP is 7044")
	void ZIPOfRecord3919() {
		assertEquals("7044", customers.get(3918).getZIP());
	}

	@Test
	@DisplayName("Record 3919: Phone is 973-239-1771")
	void PhoneOfRecord3919() {
		assertEquals("973-239-1771", customers.get(3918).getPhone());
	}

	@Test
	@DisplayName("Record 3919: Fax is 973-239-8543")
	void FaxOfRecord3919() {
		assertEquals("973-239-8543", customers.get(3918).getFax());
	}

	@Test
	@DisplayName("Record 3919: Email is louis@schauf.com")
	void EmailOfRecord3919() {
		assertEquals("louis@schauf.com", customers.get(3918).getEmail());
	}

	@Test
	@DisplayName("Record 3919: Web is http://www.louisschauf.com")
	void WebOfRecord3919() {
		assertEquals("http://www.louisschauf.com", customers.get(3918).getWeb());
	}
}
