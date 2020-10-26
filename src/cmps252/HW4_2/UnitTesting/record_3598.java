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

@Tag("7")
class Record_3598 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3598: FirstName is Tonya")
	void FirstNameOfRecord3598() {
		assertEquals("Tonya", customers.get(3597).getFirstName());
	}

	@Test
	@DisplayName("Record 3598: LastName is Corrya")
	void LastNameOfRecord3598() {
		assertEquals("Corrya", customers.get(3597).getLastName());
	}

	@Test
	@DisplayName("Record 3598: Company is Clean Air Filters Inc")
	void CompanyOfRecord3598() {
		assertEquals("Clean Air Filters Inc", customers.get(3597).getCompany());
	}

	@Test
	@DisplayName("Record 3598: Address is 400 Lafayette St  #-300")
	void AddressOfRecord3598() {
		assertEquals("400 Lafayette St  #-300", customers.get(3597).getAddress());
	}

	@Test
	@DisplayName("Record 3598: City is New Orleans")
	void CityOfRecord3598() {
		assertEquals("New Orleans", customers.get(3597).getCity());
	}

	@Test
	@DisplayName("Record 3598: County is Orleans")
	void CountyOfRecord3598() {
		assertEquals("Orleans", customers.get(3597).getCounty());
	}

	@Test
	@DisplayName("Record 3598: State is LA")
	void StateOfRecord3598() {
		assertEquals("LA", customers.get(3597).getState());
	}

	@Test
	@DisplayName("Record 3598: ZIP is 70130")
	void ZIPOfRecord3598() {
		assertEquals("70130", customers.get(3597).getZIP());
	}

	@Test
	@DisplayName("Record 3598: Phone is 504-524-1936")
	void PhoneOfRecord3598() {
		assertEquals("504-524-1936", customers.get(3597).getPhone());
	}

	@Test
	@DisplayName("Record 3598: Fax is 504-524-5841")
	void FaxOfRecord3598() {
		assertEquals("504-524-5841", customers.get(3597).getFax());
	}

	@Test
	@DisplayName("Record 3598: Email is tonya@corrya.com")
	void EmailOfRecord3598() {
		assertEquals("tonya@corrya.com", customers.get(3597).getEmail());
	}

	@Test
	@DisplayName("Record 3598: Web is http://www.tonyacorrya.com")
	void WebOfRecord3598() {
		assertEquals("http://www.tonyacorrya.com", customers.get(3597).getWeb());
	}
}
