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
class Record_2819 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2819: FirstName is Portia")
	void FirstNameOfRecord2819() {
		assertEquals("Portia", customers.get(2818).getFirstName());
	}

	@Test
	@DisplayName("Record 2819: LastName is Kerst")
	void LastNameOfRecord2819() {
		assertEquals("Kerst", customers.get(2818).getLastName());
	}

	@Test
	@DisplayName("Record 2819: Company is Mistler, Daniel T Esq")
	void CompanyOfRecord2819() {
		assertEquals("Mistler, Daniel T Esq", customers.get(2818).getCompany());
	}

	@Test
	@DisplayName("Record 2819: Address is 4777 Beechnut Dr")
	void AddressOfRecord2819() {
		assertEquals("4777 Beechnut Dr", customers.get(2818).getAddress());
	}

	@Test
	@DisplayName("Record 2819: City is Saint Joseph")
	void CityOfRecord2819() {
		assertEquals("Saint Joseph", customers.get(2818).getCity());
	}

	@Test
	@DisplayName("Record 2819: County is Berrien")
	void CountyOfRecord2819() {
		assertEquals("Berrien", customers.get(2818).getCounty());
	}

	@Test
	@DisplayName("Record 2819: State is MI")
	void StateOfRecord2819() {
		assertEquals("MI", customers.get(2818).getState());
	}

	@Test
	@DisplayName("Record 2819: ZIP is 49085")
	void ZIPOfRecord2819() {
		assertEquals("49085", customers.get(2818).getZIP());
	}

	@Test
	@DisplayName("Record 2819: Phone is 269-429-6458")
	void PhoneOfRecord2819() {
		assertEquals("269-429-6458", customers.get(2818).getPhone());
	}

	@Test
	@DisplayName("Record 2819: Fax is 269-429-9887")
	void FaxOfRecord2819() {
		assertEquals("269-429-9887", customers.get(2818).getFax());
	}

	@Test
	@DisplayName("Record 2819: Email is portia@kerst.com")
	void EmailOfRecord2819() {
		assertEquals("portia@kerst.com", customers.get(2818).getEmail());
	}

	@Test
	@DisplayName("Record 2819: Web is http://www.portiakerst.com")
	void WebOfRecord2819() {
		assertEquals("http://www.portiakerst.com", customers.get(2818).getWeb());
	}
}
