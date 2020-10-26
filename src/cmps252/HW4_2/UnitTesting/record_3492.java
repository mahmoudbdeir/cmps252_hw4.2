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

@Tag("12")
class Record_3492 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3492: FirstName is Abram")
	void FirstNameOfRecord3492() {
		assertEquals("Abram", customers.get(3491).getFirstName());
	}

	@Test
	@DisplayName("Record 3492: LastName is Ellers")
	void LastNameOfRecord3492() {
		assertEquals("Ellers", customers.get(3491).getLastName());
	}

	@Test
	@DisplayName("Record 3492: Company is United Paint Place")
	void CompanyOfRecord3492() {
		assertEquals("United Paint Place", customers.get(3491).getCompany());
	}

	@Test
	@DisplayName("Record 3492: Address is 1010 2nd Ave")
	void AddressOfRecord3492() {
		assertEquals("1010 2nd Ave", customers.get(3491).getAddress());
	}

	@Test
	@DisplayName("Record 3492: City is San Diego")
	void CityOfRecord3492() {
		assertEquals("San Diego", customers.get(3491).getCity());
	}

	@Test
	@DisplayName("Record 3492: County is San Diego")
	void CountyOfRecord3492() {
		assertEquals("San Diego", customers.get(3491).getCounty());
	}

	@Test
	@DisplayName("Record 3492: State is CA")
	void StateOfRecord3492() {
		assertEquals("CA", customers.get(3491).getState());
	}

	@Test
	@DisplayName("Record 3492: ZIP is 92101")
	void ZIPOfRecord3492() {
		assertEquals("92101", customers.get(3491).getZIP());
	}

	@Test
	@DisplayName("Record 3492: Phone is 619-238-7280")
	void PhoneOfRecord3492() {
		assertEquals("619-238-7280", customers.get(3491).getPhone());
	}

	@Test
	@DisplayName("Record 3492: Fax is 619-238-5923")
	void FaxOfRecord3492() {
		assertEquals("619-238-5923", customers.get(3491).getFax());
	}

	@Test
	@DisplayName("Record 3492: Email is abram@ellers.com")
	void EmailOfRecord3492() {
		assertEquals("abram@ellers.com", customers.get(3491).getEmail());
	}

	@Test
	@DisplayName("Record 3492: Web is http://www.abramellers.com")
	void WebOfRecord3492() {
		assertEquals("http://www.abramellers.com", customers.get(3491).getWeb());
	}
}
