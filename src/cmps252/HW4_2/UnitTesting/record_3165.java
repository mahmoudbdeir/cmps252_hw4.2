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

@Tag("15")
class Record_3165 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3165: FirstName is Kelvin")
	void FirstNameOfRecord3165() {
		assertEquals("Kelvin", customers.get(3164).getFirstName());
	}

	@Test
	@DisplayName("Record 3165: LastName is Adside")
	void LastNameOfRecord3165() {
		assertEquals("Adside", customers.get(3164).getLastName());
	}

	@Test
	@DisplayName("Record 3165: Company is Ryhart, Donald L Esq")
	void CompanyOfRecord3165() {
		assertEquals("Ryhart, Donald L Esq", customers.get(3164).getCompany());
	}

	@Test
	@DisplayName("Record 3165: Address is 2235 Hammond Dr  #-e")
	void AddressOfRecord3165() {
		assertEquals("2235 Hammond Dr  #-e", customers.get(3164).getAddress());
	}

	@Test
	@DisplayName("Record 3165: City is Schaumburg")
	void CityOfRecord3165() {
		assertEquals("Schaumburg", customers.get(3164).getCity());
	}

	@Test
	@DisplayName("Record 3165: County is Cook")
	void CountyOfRecord3165() {
		assertEquals("Cook", customers.get(3164).getCounty());
	}

	@Test
	@DisplayName("Record 3165: State is IL")
	void StateOfRecord3165() {
		assertEquals("IL", customers.get(3164).getState());
	}

	@Test
	@DisplayName("Record 3165: ZIP is 60173")
	void ZIPOfRecord3165() {
		assertEquals("60173", customers.get(3164).getZIP());
	}

	@Test
	@DisplayName("Record 3165: Phone is 847-397-4990")
	void PhoneOfRecord3165() {
		assertEquals("847-397-4990", customers.get(3164).getPhone());
	}

	@Test
	@DisplayName("Record 3165: Fax is 847-397-2368")
	void FaxOfRecord3165() {
		assertEquals("847-397-2368", customers.get(3164).getFax());
	}

	@Test
	@DisplayName("Record 3165: Email is kelvin@adside.com")
	void EmailOfRecord3165() {
		assertEquals("kelvin@adside.com", customers.get(3164).getEmail());
	}

	@Test
	@DisplayName("Record 3165: Web is http://www.kelvinadside.com")
	void WebOfRecord3165() {
		assertEquals("http://www.kelvinadside.com", customers.get(3164).getWeb());
	}
}
