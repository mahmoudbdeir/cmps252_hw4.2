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

@Tag("44")
class Record_3859 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3859: FirstName is Alva")
	void FirstNameOfRecord3859() {
		assertEquals("Alva", customers.get(3858).getFirstName());
	}

	@Test
	@DisplayName("Record 3859: LastName is Orsini")
	void LastNameOfRecord3859() {
		assertEquals("Orsini", customers.get(3858).getLastName());
	}

	@Test
	@DisplayName("Record 3859: Company is Rothstone, Charles J Esq")
	void CompanyOfRecord3859() {
		assertEquals("Rothstone, Charles J Esq", customers.get(3858).getCompany());
	}

	@Test
	@DisplayName("Record 3859: Address is 2107 Adams St")
	void AddressOfRecord3859() {
		assertEquals("2107 Adams St", customers.get(3858).getAddress());
	}

	@Test
	@DisplayName("Record 3859: City is Indianapolis")
	void CityOfRecord3859() {
		assertEquals("Indianapolis", customers.get(3858).getCity());
	}

	@Test
	@DisplayName("Record 3859: County is Marion")
	void CountyOfRecord3859() {
		assertEquals("Marion", customers.get(3858).getCounty());
	}

	@Test
	@DisplayName("Record 3859: State is IN")
	void StateOfRecord3859() {
		assertEquals("IN", customers.get(3858).getState());
	}

	@Test
	@DisplayName("Record 3859: ZIP is 46218")
	void ZIPOfRecord3859() {
		assertEquals("46218", customers.get(3858).getZIP());
	}

	@Test
	@DisplayName("Record 3859: Phone is 317-545-0931")
	void PhoneOfRecord3859() {
		assertEquals("317-545-0931", customers.get(3858).getPhone());
	}

	@Test
	@DisplayName("Record 3859: Fax is 317-545-5923")
	void FaxOfRecord3859() {
		assertEquals("317-545-5923", customers.get(3858).getFax());
	}

	@Test
	@DisplayName("Record 3859: Email is alva@orsini.com")
	void EmailOfRecord3859() {
		assertEquals("alva@orsini.com", customers.get(3858).getEmail());
	}

	@Test
	@DisplayName("Record 3859: Web is http://www.alvaorsini.com")
	void WebOfRecord3859() {
		assertEquals("http://www.alvaorsini.com", customers.get(3858).getWeb());
	}
}
