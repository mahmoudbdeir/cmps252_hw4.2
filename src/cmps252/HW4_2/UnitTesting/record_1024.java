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

@Tag("13")
class Record_1024 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1024: FirstName is Dominique")
	void FirstNameOfRecord1024() {
		assertEquals("Dominique", customers.get(1023).getFirstName());
	}

	@Test
	@DisplayName("Record 1024: LastName is Moczygemba")
	void LastNameOfRecord1024() {
		assertEquals("Moczygemba", customers.get(1023).getLastName());
	}

	@Test
	@DisplayName("Record 1024: Company is A B C Printing Co")
	void CompanyOfRecord1024() {
		assertEquals("A B C Printing Co", customers.get(1023).getCompany());
	}

	@Test
	@DisplayName("Record 1024: Address is 1632 Hart St")
	void AddressOfRecord1024() {
		assertEquals("1632 Hart St", customers.get(1023).getAddress());
	}

	@Test
	@DisplayName("Record 1024: City is Honolulu")
	void CityOfRecord1024() {
		assertEquals("Honolulu", customers.get(1023).getCity());
	}

	@Test
	@DisplayName("Record 1024: County is Honolulu")
	void CountyOfRecord1024() {
		assertEquals("Honolulu", customers.get(1023).getCounty());
	}

	@Test
	@DisplayName("Record 1024: State is HI")
	void StateOfRecord1024() {
		assertEquals("HI", customers.get(1023).getState());
	}

	@Test
	@DisplayName("Record 1024: ZIP is 96817")
	void ZIPOfRecord1024() {
		assertEquals("96817", customers.get(1023).getZIP());
	}

	@Test
	@DisplayName("Record 1024: Phone is 808-533-5499")
	void PhoneOfRecord1024() {
		assertEquals("808-533-5499", customers.get(1023).getPhone());
	}

	@Test
	@DisplayName("Record 1024: Fax is 808-533-2865")
	void FaxOfRecord1024() {
		assertEquals("808-533-2865", customers.get(1023).getFax());
	}

	@Test
	@DisplayName("Record 1024: Email is dominique@moczygemba.com")
	void EmailOfRecord1024() {
		assertEquals("dominique@moczygemba.com", customers.get(1023).getEmail());
	}

	@Test
	@DisplayName("Record 1024: Web is http://www.dominiquemoczygemba.com")
	void WebOfRecord1024() {
		assertEquals("http://www.dominiquemoczygemba.com", customers.get(1023).getWeb());
	}
}
