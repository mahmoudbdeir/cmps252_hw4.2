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

@Tag("2")
class Record_3758 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3758: FirstName is Nicky")
	void FirstNameOfRecord3758() {
		assertEquals("Nicky", customers.get(3757).getFirstName());
	}

	@Test
	@DisplayName("Record 3758: LastName is Corathers")
	void LastNameOfRecord3758() {
		assertEquals("Corathers", customers.get(3757).getLastName());
	}

	@Test
	@DisplayName("Record 3758: Company is Holt Associates")
	void CompanyOfRecord3758() {
		assertEquals("Holt Associates", customers.get(3757).getCompany());
	}

	@Test
	@DisplayName("Record 3758: Address is 5461 Southwyck Blvd")
	void AddressOfRecord3758() {
		assertEquals("5461 Southwyck Blvd", customers.get(3757).getAddress());
	}

	@Test
	@DisplayName("Record 3758: City is Toledo")
	void CityOfRecord3758() {
		assertEquals("Toledo", customers.get(3757).getCity());
	}

	@Test
	@DisplayName("Record 3758: County is Lucas")
	void CountyOfRecord3758() {
		assertEquals("Lucas", customers.get(3757).getCounty());
	}

	@Test
	@DisplayName("Record 3758: State is OH")
	void StateOfRecord3758() {
		assertEquals("OH", customers.get(3757).getState());
	}

	@Test
	@DisplayName("Record 3758: ZIP is 43614")
	void ZIPOfRecord3758() {
		assertEquals("43614", customers.get(3757).getZIP());
	}

	@Test
	@DisplayName("Record 3758: Phone is 419-893-6119")
	void PhoneOfRecord3758() {
		assertEquals("419-893-6119", customers.get(3757).getPhone());
	}

	@Test
	@DisplayName("Record 3758: Fax is 419-893-2036")
	void FaxOfRecord3758() {
		assertEquals("419-893-2036", customers.get(3757).getFax());
	}

	@Test
	@DisplayName("Record 3758: Email is nicky@corathers.com")
	void EmailOfRecord3758() {
		assertEquals("nicky@corathers.com", customers.get(3757).getEmail());
	}

	@Test
	@DisplayName("Record 3758: Web is http://www.nickycorathers.com")
	void WebOfRecord3758() {
		assertEquals("http://www.nickycorathers.com", customers.get(3757).getWeb());
	}
}
