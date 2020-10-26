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

@Tag("49")
class Record_3772 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3772: FirstName is Rhea")
	void FirstNameOfRecord3772() {
		assertEquals("Rhea", customers.get(3771).getFirstName());
	}

	@Test
	@DisplayName("Record 3772: LastName is Coder")
	void LastNameOfRecord3772() {
		assertEquals("Coder", customers.get(3771).getLastName());
	}

	@Test
	@DisplayName("Record 3772: Company is Wyntraub, Alan I Esq")
	void CompanyOfRecord3772() {
		assertEquals("Wyntraub, Alan I Esq", customers.get(3771).getCompany());
	}

	@Test
	@DisplayName("Record 3772: Address is 3725 Castor Ave")
	void AddressOfRecord3772() {
		assertEquals("3725 Castor Ave", customers.get(3771).getAddress());
	}

	@Test
	@DisplayName("Record 3772: City is Philadelphia")
	void CityOfRecord3772() {
		assertEquals("Philadelphia", customers.get(3771).getCity());
	}

	@Test
	@DisplayName("Record 3772: County is Philadelphia")
	void CountyOfRecord3772() {
		assertEquals("Philadelphia", customers.get(3771).getCounty());
	}

	@Test
	@DisplayName("Record 3772: State is PA")
	void StateOfRecord3772() {
		assertEquals("PA", customers.get(3771).getState());
	}

	@Test
	@DisplayName("Record 3772: ZIP is 19124")
	void ZIPOfRecord3772() {
		assertEquals("19124", customers.get(3771).getZIP());
	}

	@Test
	@DisplayName("Record 3772: Phone is 215-537-4568")
	void PhoneOfRecord3772() {
		assertEquals("215-537-4568", customers.get(3771).getPhone());
	}

	@Test
	@DisplayName("Record 3772: Fax is 215-537-0389")
	void FaxOfRecord3772() {
		assertEquals("215-537-0389", customers.get(3771).getFax());
	}

	@Test
	@DisplayName("Record 3772: Email is rhea@coder.com")
	void EmailOfRecord3772() {
		assertEquals("rhea@coder.com", customers.get(3771).getEmail());
	}

	@Test
	@DisplayName("Record 3772: Web is http://www.rheacoder.com")
	void WebOfRecord3772() {
		assertEquals("http://www.rheacoder.com", customers.get(3771).getWeb());
	}
}
