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

@Tag("43")
class Record_3367 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3367: FirstName is Justin")
	void FirstNameOfRecord3367() {
		assertEquals("Justin", customers.get(3366).getFirstName());
	}

	@Test
	@DisplayName("Record 3367: LastName is Deshotels")
	void LastNameOfRecord3367() {
		assertEquals("Deshotels", customers.get(3366).getLastName());
	}

	@Test
	@DisplayName("Record 3367: Company is Morcroft Leasing")
	void CompanyOfRecord3367() {
		assertEquals("Morcroft Leasing", customers.get(3366).getCompany());
	}

	@Test
	@DisplayName("Record 3367: Address is 33425 Western Ave")
	void AddressOfRecord3367() {
		assertEquals("33425 Western Ave", customers.get(3366).getAddress());
	}

	@Test
	@DisplayName("Record 3367: City is Union City")
	void CityOfRecord3367() {
		assertEquals("Union City", customers.get(3366).getCity());
	}

	@Test
	@DisplayName("Record 3367: County is Alameda")
	void CountyOfRecord3367() {
		assertEquals("Alameda", customers.get(3366).getCounty());
	}

	@Test
	@DisplayName("Record 3367: State is CA")
	void StateOfRecord3367() {
		assertEquals("CA", customers.get(3366).getState());
	}

	@Test
	@DisplayName("Record 3367: ZIP is 94587")
	void ZIPOfRecord3367() {
		assertEquals("94587", customers.get(3366).getZIP());
	}

	@Test
	@DisplayName("Record 3367: Phone is 510-471-0928")
	void PhoneOfRecord3367() {
		assertEquals("510-471-0928", customers.get(3366).getPhone());
	}

	@Test
	@DisplayName("Record 3367: Fax is 510-471-0395")
	void FaxOfRecord3367() {
		assertEquals("510-471-0395", customers.get(3366).getFax());
	}

	@Test
	@DisplayName("Record 3367: Email is justin@deshotels.com")
	void EmailOfRecord3367() {
		assertEquals("justin@deshotels.com", customers.get(3366).getEmail());
	}

	@Test
	@DisplayName("Record 3367: Web is http://www.justindeshotels.com")
	void WebOfRecord3367() {
		assertEquals("http://www.justindeshotels.com", customers.get(3366).getWeb());
	}
}
