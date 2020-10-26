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

@Tag("6")
class Record_2171 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2171: FirstName is Vito")
	void FirstNameOfRecord2171() {
		assertEquals("Vito", customers.get(2170).getFirstName());
	}

	@Test
	@DisplayName("Record 2171: LastName is Pedez")
	void LastNameOfRecord2171() {
		assertEquals("Pedez", customers.get(2170).getLastName());
	}

	@Test
	@DisplayName("Record 2171: Company is Diamond Shamrock Real Est Dept")
	void CompanyOfRecord2171() {
		assertEquals("Diamond Shamrock Real Est Dept", customers.get(2170).getCompany());
	}

	@Test
	@DisplayName("Record 2171: Address is 779 Hartford Tpke")
	void AddressOfRecord2171() {
		assertEquals("779 Hartford Tpke", customers.get(2170).getAddress());
	}

	@Test
	@DisplayName("Record 2171: City is Shrewsbury")
	void CityOfRecord2171() {
		assertEquals("Shrewsbury", customers.get(2170).getCity());
	}

	@Test
	@DisplayName("Record 2171: County is Worcester")
	void CountyOfRecord2171() {
		assertEquals("Worcester", customers.get(2170).getCounty());
	}

	@Test
	@DisplayName("Record 2171: State is MA")
	void StateOfRecord2171() {
		assertEquals("MA", customers.get(2170).getState());
	}

	@Test
	@DisplayName("Record 2171: ZIP is 1545")
	void ZIPOfRecord2171() {
		assertEquals("1545", customers.get(2170).getZIP());
	}

	@Test
	@DisplayName("Record 2171: Phone is 508-842-5474")
	void PhoneOfRecord2171() {
		assertEquals("508-842-5474", customers.get(2170).getPhone());
	}

	@Test
	@DisplayName("Record 2171: Fax is 508-842-1919")
	void FaxOfRecord2171() {
		assertEquals("508-842-1919", customers.get(2170).getFax());
	}

	@Test
	@DisplayName("Record 2171: Email is vito@pedez.com")
	void EmailOfRecord2171() {
		assertEquals("vito@pedez.com", customers.get(2170).getEmail());
	}

	@Test
	@DisplayName("Record 2171: Web is http://www.vitopedez.com")
	void WebOfRecord2171() {
		assertEquals("http://www.vitopedez.com", customers.get(2170).getWeb());
	}
}
