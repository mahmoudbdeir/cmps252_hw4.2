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

@Tag("40")
class Record_3877 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3877: FirstName is Odessa")
	void FirstNameOfRecord3877() {
		assertEquals("Odessa", customers.get(3876).getFirstName());
	}

	@Test
	@DisplayName("Record 3877: LastName is Sangrey")
	void LastNameOfRecord3877() {
		assertEquals("Sangrey", customers.get(3876).getLastName());
	}

	@Test
	@DisplayName("Record 3877: Company is Qualitron Aero Services Inc")
	void CompanyOfRecord3877() {
		assertEquals("Qualitron Aero Services Inc", customers.get(3876).getCompany());
	}

	@Test
	@DisplayName("Record 3877: Address is 20 Alexander Ct")
	void AddressOfRecord3877() {
		assertEquals("20 Alexander Ct", customers.get(3876).getAddress());
	}

	@Test
	@DisplayName("Record 3877: City is Ronkonkoma")
	void CityOfRecord3877() {
		assertEquals("Ronkonkoma", customers.get(3876).getCity());
	}

	@Test
	@DisplayName("Record 3877: County is Suffolk")
	void CountyOfRecord3877() {
		assertEquals("Suffolk", customers.get(3876).getCounty());
	}

	@Test
	@DisplayName("Record 3877: State is NY")
	void StateOfRecord3877() {
		assertEquals("NY", customers.get(3876).getState());
	}

	@Test
	@DisplayName("Record 3877: ZIP is 11779")
	void ZIPOfRecord3877() {
		assertEquals("11779", customers.get(3876).getZIP());
	}

	@Test
	@DisplayName("Record 3877: Phone is 631-737-5448")
	void PhoneOfRecord3877() {
		assertEquals("631-737-5448", customers.get(3876).getPhone());
	}

	@Test
	@DisplayName("Record 3877: Fax is 631-737-7951")
	void FaxOfRecord3877() {
		assertEquals("631-737-7951", customers.get(3876).getFax());
	}

	@Test
	@DisplayName("Record 3877: Email is odessa@sangrey.com")
	void EmailOfRecord3877() {
		assertEquals("odessa@sangrey.com", customers.get(3876).getEmail());
	}

	@Test
	@DisplayName("Record 3877: Web is http://www.odessasangrey.com")
	void WebOfRecord3877() {
		assertEquals("http://www.odessasangrey.com", customers.get(3876).getWeb());
	}
}
