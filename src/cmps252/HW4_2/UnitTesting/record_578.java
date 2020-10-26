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

@Tag("40")
class Record_578 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 578: FirstName is Eric")
	void FirstNameOfRecord578() {
		assertEquals("Eric", customers.get(577).getFirstName());
	}

	@Test
	@DisplayName("Record 578: LastName is Duttinger")
	void LastNameOfRecord578() {
		assertEquals("Duttinger", customers.get(577).getLastName());
	}

	@Test
	@DisplayName("Record 578: Company is Goodman, James L Esq")
	void CompanyOfRecord578() {
		assertEquals("Goodman, James L Esq", customers.get(577).getCompany());
	}

	@Test
	@DisplayName("Record 578: Address is 3244 W 31st St")
	void AddressOfRecord578() {
		assertEquals("3244 W 31st St", customers.get(577).getAddress());
	}

	@Test
	@DisplayName("Record 578: City is Chicago")
	void CityOfRecord578() {
		assertEquals("Chicago", customers.get(577).getCity());
	}

	@Test
	@DisplayName("Record 578: County is Cook")
	void CountyOfRecord578() {
		assertEquals("Cook", customers.get(577).getCounty());
	}

	@Test
	@DisplayName("Record 578: State is IL")
	void StateOfRecord578() {
		assertEquals("IL", customers.get(577).getState());
	}

	@Test
	@DisplayName("Record 578: ZIP is 60623")
	void ZIPOfRecord578() {
		assertEquals("60623", customers.get(577).getZIP());
	}

	@Test
	@DisplayName("Record 578: Phone is 773-247-9351")
	void PhoneOfRecord578() {
		assertEquals("773-247-9351", customers.get(577).getPhone());
	}

	@Test
	@DisplayName("Record 578: Fax is 773-247-1912")
	void FaxOfRecord578() {
		assertEquals("773-247-1912", customers.get(577).getFax());
	}

	@Test
	@DisplayName("Record 578: Email is eric@duttinger.com")
	void EmailOfRecord578() {
		assertEquals("eric@duttinger.com", customers.get(577).getEmail());
	}

	@Test
	@DisplayName("Record 578: Web is http://www.ericduttinger.com")
	void WebOfRecord578() {
		assertEquals("http://www.ericduttinger.com", customers.get(577).getWeb());
	}
}
