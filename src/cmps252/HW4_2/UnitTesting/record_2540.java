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

@Tag("31")
class Record_2540 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2540: FirstName is Lettie")
	void FirstNameOfRecord2540() {
		assertEquals("Lettie", customers.get(2539).getFirstName());
	}

	@Test
	@DisplayName("Record 2540: LastName is Cardinale")
	void LastNameOfRecord2540() {
		assertEquals("Cardinale", customers.get(2539).getLastName());
	}

	@Test
	@DisplayName("Record 2540: Company is Rynhardt, Robert L Esq")
	void CompanyOfRecord2540() {
		assertEquals("Rynhardt, Robert L Esq", customers.get(2539).getCompany());
	}

	@Test
	@DisplayName("Record 2540: Address is 3050 Sidco Dr")
	void AddressOfRecord2540() {
		assertEquals("3050 Sidco Dr", customers.get(2539).getAddress());
	}

	@Test
	@DisplayName("Record 2540: City is Nashville")
	void CityOfRecord2540() {
		assertEquals("Nashville", customers.get(2539).getCity());
	}

	@Test
	@DisplayName("Record 2540: County is Davidson")
	void CountyOfRecord2540() {
		assertEquals("Davidson", customers.get(2539).getCounty());
	}

	@Test
	@DisplayName("Record 2540: State is TN")
	void StateOfRecord2540() {
		assertEquals("TN", customers.get(2539).getState());
	}

	@Test
	@DisplayName("Record 2540: ZIP is 37204")
	void ZIPOfRecord2540() {
		assertEquals("37204", customers.get(2539).getZIP());
	}

	@Test
	@DisplayName("Record 2540: Phone is 615-244-7401")
	void PhoneOfRecord2540() {
		assertEquals("615-244-7401", customers.get(2539).getPhone());
	}

	@Test
	@DisplayName("Record 2540: Fax is 615-244-8338")
	void FaxOfRecord2540() {
		assertEquals("615-244-8338", customers.get(2539).getFax());
	}

	@Test
	@DisplayName("Record 2540: Email is lettie@cardinale.com")
	void EmailOfRecord2540() {
		assertEquals("lettie@cardinale.com", customers.get(2539).getEmail());
	}

	@Test
	@DisplayName("Record 2540: Web is http://www.lettiecardinale.com")
	void WebOfRecord2540() {
		assertEquals("http://www.lettiecardinale.com", customers.get(2539).getWeb());
	}
}
