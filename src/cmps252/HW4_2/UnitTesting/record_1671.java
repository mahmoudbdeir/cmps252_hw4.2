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

@Tag("38")
class Record_1671 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1671: FirstName is Karrie")
	void FirstNameOfRecord1671() {
		assertEquals("Karrie", customers.get(1670).getFirstName());
	}

	@Test
	@DisplayName("Record 1671: LastName is Solien")
	void LastNameOfRecord1671() {
		assertEquals("Solien", customers.get(1670).getLastName());
	}

	@Test
	@DisplayName("Record 1671: Company is Wasserman, Alan Esq")
	void CompanyOfRecord1671() {
		assertEquals("Wasserman, Alan Esq", customers.get(1670).getCompany());
	}

	@Test
	@DisplayName("Record 1671: Address is 1 N Jefferson Ave")
	void AddressOfRecord1671() {
		assertEquals("1 N Jefferson Ave", customers.get(1670).getAddress());
	}

	@Test
	@DisplayName("Record 1671: City is Saint Louis")
	void CityOfRecord1671() {
		assertEquals("Saint Louis", customers.get(1670).getCity());
	}

	@Test
	@DisplayName("Record 1671: County is Saint Louis City")
	void CountyOfRecord1671() {
		assertEquals("Saint Louis City", customers.get(1670).getCounty());
	}

	@Test
	@DisplayName("Record 1671: State is MO")
	void StateOfRecord1671() {
		assertEquals("MO", customers.get(1670).getState());
	}

	@Test
	@DisplayName("Record 1671: ZIP is 63103")
	void ZIPOfRecord1671() {
		assertEquals("63103", customers.get(1670).getZIP());
	}

	@Test
	@DisplayName("Record 1671: Phone is 314-289-8586")
	void PhoneOfRecord1671() {
		assertEquals("314-289-8586", customers.get(1670).getPhone());
	}

	@Test
	@DisplayName("Record 1671: Fax is 314-289-4765")
	void FaxOfRecord1671() {
		assertEquals("314-289-4765", customers.get(1670).getFax());
	}

	@Test
	@DisplayName("Record 1671: Email is karrie@solien.com")
	void EmailOfRecord1671() {
		assertEquals("karrie@solien.com", customers.get(1670).getEmail());
	}

	@Test
	@DisplayName("Record 1671: Web is http://www.karriesolien.com")
	void WebOfRecord1671() {
		assertEquals("http://www.karriesolien.com", customers.get(1670).getWeb());
	}
}
