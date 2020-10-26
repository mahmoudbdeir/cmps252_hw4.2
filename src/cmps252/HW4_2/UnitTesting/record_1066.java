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

@Tag("42")
class Record_1066 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1066: FirstName is Jame")
	void FirstNameOfRecord1066() {
		assertEquals("Jame", customers.get(1065).getFirstName());
	}

	@Test
	@DisplayName("Record 1066: LastName is Latendresse")
	void LastNameOfRecord1066() {
		assertEquals("Latendresse", customers.get(1065).getLastName());
	}

	@Test
	@DisplayName("Record 1066: Company is Hubbard, William B Esq")
	void CompanyOfRecord1066() {
		assertEquals("Hubbard, William B Esq", customers.get(1065).getCompany());
	}

	@Test
	@DisplayName("Record 1066: Address is 7601 Poplar Hill Ln")
	void AddressOfRecord1066() {
		assertEquals("7601 Poplar Hill Ln", customers.get(1065).getAddress());
	}

	@Test
	@DisplayName("Record 1066: City is Clinton")
	void CityOfRecord1066() {
		assertEquals("Clinton", customers.get(1065).getCity());
	}

	@Test
	@DisplayName("Record 1066: County is Prince Georges")
	void CountyOfRecord1066() {
		assertEquals("Prince Georges", customers.get(1065).getCounty());
	}

	@Test
	@DisplayName("Record 1066: State is MD")
	void StateOfRecord1066() {
		assertEquals("MD", customers.get(1065).getState());
	}

	@Test
	@DisplayName("Record 1066: ZIP is 20735")
	void ZIPOfRecord1066() {
		assertEquals("20735", customers.get(1065).getZIP());
	}

	@Test
	@DisplayName("Record 1066: Phone is 301-868-1391")
	void PhoneOfRecord1066() {
		assertEquals("301-868-1391", customers.get(1065).getPhone());
	}

	@Test
	@DisplayName("Record 1066: Fax is 301-868-3725")
	void FaxOfRecord1066() {
		assertEquals("301-868-3725", customers.get(1065).getFax());
	}

	@Test
	@DisplayName("Record 1066: Email is jame@latendresse.com")
	void EmailOfRecord1066() {
		assertEquals("jame@latendresse.com", customers.get(1065).getEmail());
	}

	@Test
	@DisplayName("Record 1066: Web is http://www.jamelatendresse.com")
	void WebOfRecord1066() {
		assertEquals("http://www.jamelatendresse.com", customers.get(1065).getWeb());
	}
}
