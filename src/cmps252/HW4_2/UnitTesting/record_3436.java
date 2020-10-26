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

@Tag("5")
class Record_3436 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3436: FirstName is Tyree")
	void FirstNameOfRecord3436() {
		assertEquals("Tyree", customers.get(3435).getFirstName());
	}

	@Test
	@DisplayName("Record 3436: LastName is Mutone")
	void LastNameOfRecord3436() {
		assertEquals("Mutone", customers.get(3435).getLastName());
	}

	@Test
	@DisplayName("Record 3436: Company is Memorial Monuments")
	void CompanyOfRecord3436() {
		assertEquals("Memorial Monuments", customers.get(3435).getCompany());
	}

	@Test
	@DisplayName("Record 3436: Address is 128 Columbus St")
	void AddressOfRecord3436() {
		assertEquals("128 Columbus St", customers.get(3435).getAddress());
	}

	@Test
	@DisplayName("Record 3436: City is Grand Haven")
	void CityOfRecord3436() {
		assertEquals("Grand Haven", customers.get(3435).getCity());
	}

	@Test
	@DisplayName("Record 3436: County is Ottawa")
	void CountyOfRecord3436() {
		assertEquals("Ottawa", customers.get(3435).getCounty());
	}

	@Test
	@DisplayName("Record 3436: State is MI")
	void StateOfRecord3436() {
		assertEquals("MI", customers.get(3435).getState());
	}

	@Test
	@DisplayName("Record 3436: ZIP is 49417")
	void ZIPOfRecord3436() {
		assertEquals("49417", customers.get(3435).getZIP());
	}

	@Test
	@DisplayName("Record 3436: Phone is 616-846-6121")
	void PhoneOfRecord3436() {
		assertEquals("616-846-6121", customers.get(3435).getPhone());
	}

	@Test
	@DisplayName("Record 3436: Fax is 616-846-6065")
	void FaxOfRecord3436() {
		assertEquals("616-846-6065", customers.get(3435).getFax());
	}

	@Test
	@DisplayName("Record 3436: Email is tyree@mutone.com")
	void EmailOfRecord3436() {
		assertEquals("tyree@mutone.com", customers.get(3435).getEmail());
	}

	@Test
	@DisplayName("Record 3436: Web is http://www.tyreemutone.com")
	void WebOfRecord3436() {
		assertEquals("http://www.tyreemutone.com", customers.get(3435).getWeb());
	}
}
