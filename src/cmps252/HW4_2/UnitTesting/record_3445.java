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

@Tag("42")
class Record_3445 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3445: FirstName is Scotty")
	void FirstNameOfRecord3445() {
		assertEquals("Scotty", customers.get(3444).getFirstName());
	}

	@Test
	@DisplayName("Record 3445: LastName is Blunden")
	void LastNameOfRecord3445() {
		assertEquals("Blunden", customers.get(3444).getLastName());
	}

	@Test
	@DisplayName("Record 3445: Company is Bishop, Sandra")
	void CompanyOfRecord3445() {
		assertEquals("Bishop, Sandra", customers.get(3444).getCompany());
	}

	@Test
	@DisplayName("Record 3445: Address is 869 Ringwood Ave")
	void AddressOfRecord3445() {
		assertEquals("869 Ringwood Ave", customers.get(3444).getAddress());
	}

	@Test
	@DisplayName("Record 3445: City is Haskell")
	void CityOfRecord3445() {
		assertEquals("Haskell", customers.get(3444).getCity());
	}

	@Test
	@DisplayName("Record 3445: County is Passaic")
	void CountyOfRecord3445() {
		assertEquals("Passaic", customers.get(3444).getCounty());
	}

	@Test
	@DisplayName("Record 3445: State is NJ")
	void StateOfRecord3445() {
		assertEquals("NJ", customers.get(3444).getState());
	}

	@Test
	@DisplayName("Record 3445: ZIP is 7420")
	void ZIPOfRecord3445() {
		assertEquals("7420", customers.get(3444).getZIP());
	}

	@Test
	@DisplayName("Record 3445: Phone is 973-839-5942")
	void PhoneOfRecord3445() {
		assertEquals("973-839-5942", customers.get(3444).getPhone());
	}

	@Test
	@DisplayName("Record 3445: Fax is 973-839-2186")
	void FaxOfRecord3445() {
		assertEquals("973-839-2186", customers.get(3444).getFax());
	}

	@Test
	@DisplayName("Record 3445: Email is scotty@blunden.com")
	void EmailOfRecord3445() {
		assertEquals("scotty@blunden.com", customers.get(3444).getEmail());
	}

	@Test
	@DisplayName("Record 3445: Web is http://www.scottyblunden.com")
	void WebOfRecord3445() {
		assertEquals("http://www.scottyblunden.com", customers.get(3444).getWeb());
	}
}
