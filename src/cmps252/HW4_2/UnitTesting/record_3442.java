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

@Tag("46")
class Record_3442 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3442: FirstName is Aline")
	void FirstNameOfRecord3442() {
		assertEquals("Aline", customers.get(3441).getFirstName());
	}

	@Test
	@DisplayName("Record 3442: LastName is Pelfrey")
	void LastNameOfRecord3442() {
		assertEquals("Pelfrey", customers.get(3441).getLastName());
	}

	@Test
	@DisplayName("Record 3442: Company is Miller Electric Company")
	void CompanyOfRecord3442() {
		assertEquals("Miller Electric Company", customers.get(3441).getCompany());
	}

	@Test
	@DisplayName("Record 3442: Address is 35 Corliss St")
	void AddressOfRecord3442() {
		assertEquals("35 Corliss St", customers.get(3441).getAddress());
	}

	@Test
	@DisplayName("Record 3442: City is Providence")
	void CityOfRecord3442() {
		assertEquals("Providence", customers.get(3441).getCity());
	}

	@Test
	@DisplayName("Record 3442: County is Providence")
	void CountyOfRecord3442() {
		assertEquals("Providence", customers.get(3441).getCounty());
	}

	@Test
	@DisplayName("Record 3442: State is RI")
	void StateOfRecord3442() {
		assertEquals("RI", customers.get(3441).getState());
	}

	@Test
	@DisplayName("Record 3442: ZIP is 2904")
	void ZIPOfRecord3442() {
		assertEquals("2904", customers.get(3441).getZIP());
	}

	@Test
	@DisplayName("Record 3442: Phone is 401-521-3065")
	void PhoneOfRecord3442() {
		assertEquals("401-521-3065", customers.get(3441).getPhone());
	}

	@Test
	@DisplayName("Record 3442: Fax is 401-521-5793")
	void FaxOfRecord3442() {
		assertEquals("401-521-5793", customers.get(3441).getFax());
	}

	@Test
	@DisplayName("Record 3442: Email is aline@pelfrey.com")
	void EmailOfRecord3442() {
		assertEquals("aline@pelfrey.com", customers.get(3441).getEmail());
	}

	@Test
	@DisplayName("Record 3442: Web is http://www.alinepelfrey.com")
	void WebOfRecord3442() {
		assertEquals("http://www.alinepelfrey.com", customers.get(3441).getWeb());
	}
}
