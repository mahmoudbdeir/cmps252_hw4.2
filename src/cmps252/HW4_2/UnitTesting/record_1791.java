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

@Tag("30")
class Record_1791 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1791: FirstName is Lyman")
	void FirstNameOfRecord1791() {
		assertEquals("Lyman", customers.get(1790).getFirstName());
	}

	@Test
	@DisplayName("Record 1791: LastName is Harmison")
	void LastNameOfRecord1791() {
		assertEquals("Harmison", customers.get(1790).getLastName());
	}

	@Test
	@DisplayName("Record 1791: Company is Myers, Lynn Esq")
	void CompanyOfRecord1791() {
		assertEquals("Myers, Lynn Esq", customers.get(1790).getCompany());
	}

	@Test
	@DisplayName("Record 1791: Address is 200 S Progressive Ave")
	void AddressOfRecord1791() {
		assertEquals("200 S Progressive Ave", customers.get(1790).getAddress());
	}

	@Test
	@DisplayName("Record 1791: City is Harrisburg")
	void CityOfRecord1791() {
		assertEquals("Harrisburg", customers.get(1790).getCity());
	}

	@Test
	@DisplayName("Record 1791: County is Dauphin")
	void CountyOfRecord1791() {
		assertEquals("Dauphin", customers.get(1790).getCounty());
	}

	@Test
	@DisplayName("Record 1791: State is PA")
	void StateOfRecord1791() {
		assertEquals("PA", customers.get(1790).getState());
	}

	@Test
	@DisplayName("Record 1791: ZIP is 17109")
	void ZIPOfRecord1791() {
		assertEquals("17109", customers.get(1790).getZIP());
	}

	@Test
	@DisplayName("Record 1791: Phone is 717-652-3744")
	void PhoneOfRecord1791() {
		assertEquals("717-652-3744", customers.get(1790).getPhone());
	}

	@Test
	@DisplayName("Record 1791: Fax is 717-652-0205")
	void FaxOfRecord1791() {
		assertEquals("717-652-0205", customers.get(1790).getFax());
	}

	@Test
	@DisplayName("Record 1791: Email is lyman@harmison.com")
	void EmailOfRecord1791() {
		assertEquals("lyman@harmison.com", customers.get(1790).getEmail());
	}

	@Test
	@DisplayName("Record 1791: Web is http://www.lymanharmison.com")
	void WebOfRecord1791() {
		assertEquals("http://www.lymanharmison.com", customers.get(1790).getWeb());
	}
}
