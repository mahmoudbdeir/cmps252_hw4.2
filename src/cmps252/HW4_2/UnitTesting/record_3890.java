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

@Tag("28")
class Record_3890 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3890: FirstName is Maxwell")
	void FirstNameOfRecord3890() {
		assertEquals("Maxwell", customers.get(3889).getFirstName());
	}

	@Test
	@DisplayName("Record 3890: LastName is Dejarnette")
	void LastNameOfRecord3890() {
		assertEquals("Dejarnette", customers.get(3889).getLastName());
	}

	@Test
	@DisplayName("Record 3890: Company is Klee & Brickman Cpa")
	void CompanyOfRecord3890() {
		assertEquals("Klee & Brickman Cpa", customers.get(3889).getCompany());
	}

	@Test
	@DisplayName("Record 3890: Address is 5223 Simpson Ferry Rd")
	void AddressOfRecord3890() {
		assertEquals("5223 Simpson Ferry Rd", customers.get(3889).getAddress());
	}

	@Test
	@DisplayName("Record 3890: City is Mechanicsburg")
	void CityOfRecord3890() {
		assertEquals("Mechanicsburg", customers.get(3889).getCity());
	}

	@Test
	@DisplayName("Record 3890: County is Cumberland")
	void CountyOfRecord3890() {
		assertEquals("Cumberland", customers.get(3889).getCounty());
	}

	@Test
	@DisplayName("Record 3890: State is PA")
	void StateOfRecord3890() {
		assertEquals("PA", customers.get(3889).getState());
	}

	@Test
	@DisplayName("Record 3890: ZIP is 17055")
	void ZIPOfRecord3890() {
		assertEquals("17055", customers.get(3889).getZIP());
	}

	@Test
	@DisplayName("Record 3890: Phone is 717-766-2001")
	void PhoneOfRecord3890() {
		assertEquals("717-766-2001", customers.get(3889).getPhone());
	}

	@Test
	@DisplayName("Record 3890: Fax is 717-766-8281")
	void FaxOfRecord3890() {
		assertEquals("717-766-8281", customers.get(3889).getFax());
	}

	@Test
	@DisplayName("Record 3890: Email is maxwell@dejarnette.com")
	void EmailOfRecord3890() {
		assertEquals("maxwell@dejarnette.com", customers.get(3889).getEmail());
	}

	@Test
	@DisplayName("Record 3890: Web is http://www.maxwelldejarnette.com")
	void WebOfRecord3890() {
		assertEquals("http://www.maxwelldejarnette.com", customers.get(3889).getWeb());
	}
}
