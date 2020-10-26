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

@Tag("39")
class Record_828 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 828: FirstName is Eunice")
	void FirstNameOfRecord828() {
		assertEquals("Eunice", customers.get(827).getFirstName());
	}

	@Test
	@DisplayName("Record 828: LastName is Goldfeld")
	void LastNameOfRecord828() {
		assertEquals("Goldfeld", customers.get(827).getLastName());
	}

	@Test
	@DisplayName("Record 828: Company is Noonan, David J Esq")
	void CompanyOfRecord828() {
		assertEquals("Noonan, David J Esq", customers.get(827).getCompany());
	}

	@Test
	@DisplayName("Record 828: Address is 2313 Ripley St")
	void AddressOfRecord828() {
		assertEquals("2313 Ripley St", customers.get(827).getAddress());
	}

	@Test
	@DisplayName("Record 828: City is Philadelphia")
	void CityOfRecord828() {
		assertEquals("Philadelphia", customers.get(827).getCity());
	}

	@Test
	@DisplayName("Record 828: County is Philadelphia")
	void CountyOfRecord828() {
		assertEquals("Philadelphia", customers.get(827).getCounty());
	}

	@Test
	@DisplayName("Record 828: State is PA")
	void StateOfRecord828() {
		assertEquals("PA", customers.get(827).getState());
	}

	@Test
	@DisplayName("Record 828: ZIP is 19152")
	void ZIPOfRecord828() {
		assertEquals("19152", customers.get(827).getZIP());
	}

	@Test
	@DisplayName("Record 828: Phone is 215-332-3973")
	void PhoneOfRecord828() {
		assertEquals("215-332-3973", customers.get(827).getPhone());
	}

	@Test
	@DisplayName("Record 828: Fax is 215-332-0475")
	void FaxOfRecord828() {
		assertEquals("215-332-0475", customers.get(827).getFax());
	}

	@Test
	@DisplayName("Record 828: Email is eunice@goldfeld.com")
	void EmailOfRecord828() {
		assertEquals("eunice@goldfeld.com", customers.get(827).getEmail());
	}

	@Test
	@DisplayName("Record 828: Web is http://www.eunicegoldfeld.com")
	void WebOfRecord828() {
		assertEquals("http://www.eunicegoldfeld.com", customers.get(827).getWeb());
	}
}
