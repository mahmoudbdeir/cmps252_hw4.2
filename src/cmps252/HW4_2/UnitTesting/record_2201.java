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

@Tag("18")
class Record_2201 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2201: FirstName is Harold")
	void FirstNameOfRecord2201() {
		assertEquals("Harold", customers.get(2200).getFirstName());
	}

	@Test
	@DisplayName("Record 2201: LastName is Savoca")
	void LastNameOfRecord2201() {
		assertEquals("Savoca", customers.get(2200).getLastName());
	}

	@Test
	@DisplayName("Record 2201: Company is Mm Interiors Inc")
	void CompanyOfRecord2201() {
		assertEquals("Mm Interiors Inc", customers.get(2200).getCompany());
	}

	@Test
	@DisplayName("Record 2201: Address is 28752 Marguerite Pky")
	void AddressOfRecord2201() {
		assertEquals("28752 Marguerite Pky", customers.get(2200).getAddress());
	}

	@Test
	@DisplayName("Record 2201: City is Mission Viejo")
	void CityOfRecord2201() {
		assertEquals("Mission Viejo", customers.get(2200).getCity());
	}

	@Test
	@DisplayName("Record 2201: County is Orange")
	void CountyOfRecord2201() {
		assertEquals("Orange", customers.get(2200).getCounty());
	}

	@Test
	@DisplayName("Record 2201: State is CA")
	void StateOfRecord2201() {
		assertEquals("CA", customers.get(2200).getState());
	}

	@Test
	@DisplayName("Record 2201: ZIP is 92692")
	void ZIPOfRecord2201() {
		assertEquals("92692", customers.get(2200).getZIP());
	}

	@Test
	@DisplayName("Record 2201: Phone is 949-364-5870")
	void PhoneOfRecord2201() {
		assertEquals("949-364-5870", customers.get(2200).getPhone());
	}

	@Test
	@DisplayName("Record 2201: Fax is 949-364-3126")
	void FaxOfRecord2201() {
		assertEquals("949-364-3126", customers.get(2200).getFax());
	}

	@Test
	@DisplayName("Record 2201: Email is harold@savoca.com")
	void EmailOfRecord2201() {
		assertEquals("harold@savoca.com", customers.get(2200).getEmail());
	}

	@Test
	@DisplayName("Record 2201: Web is http://www.haroldsavoca.com")
	void WebOfRecord2201() {
		assertEquals("http://www.haroldsavoca.com", customers.get(2200).getWeb());
	}
}
