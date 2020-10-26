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

@Tag("9")
class Record_3396 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3396: FirstName is Margarito")
	void FirstNameOfRecord3396() {
		assertEquals("Margarito", customers.get(3395).getFirstName());
	}

	@Test
	@DisplayName("Record 3396: LastName is Oehm")
	void LastNameOfRecord3396() {
		assertEquals("Oehm", customers.get(3395).getLastName());
	}

	@Test
	@DisplayName("Record 3396: Company is Geographics Inc Printg & Dsgn")
	void CompanyOfRecord3396() {
		assertEquals("Geographics Inc Printg & Dsgn", customers.get(3395).getCompany());
	}

	@Test
	@DisplayName("Record 3396: Address is 216 Wyoming Ave")
	void AddressOfRecord3396() {
		assertEquals("216 Wyoming Ave", customers.get(3395).getAddress());
	}

	@Test
	@DisplayName("Record 3396: City is Kingston")
	void CityOfRecord3396() {
		assertEquals("Kingston", customers.get(3395).getCity());
	}

	@Test
	@DisplayName("Record 3396: County is Luzerne")
	void CountyOfRecord3396() {
		assertEquals("Luzerne", customers.get(3395).getCounty());
	}

	@Test
	@DisplayName("Record 3396: State is PA")
	void StateOfRecord3396() {
		assertEquals("PA", customers.get(3395).getState());
	}

	@Test
	@DisplayName("Record 3396: ZIP is 18704")
	void ZIPOfRecord3396() {
		assertEquals("18704", customers.get(3395).getZIP());
	}

	@Test
	@DisplayName("Record 3396: Phone is 570-283-7918")
	void PhoneOfRecord3396() {
		assertEquals("570-283-7918", customers.get(3395).getPhone());
	}

	@Test
	@DisplayName("Record 3396: Fax is 570-283-8432")
	void FaxOfRecord3396() {
		assertEquals("570-283-8432", customers.get(3395).getFax());
	}

	@Test
	@DisplayName("Record 3396: Email is margarito@oehm.com")
	void EmailOfRecord3396() {
		assertEquals("margarito@oehm.com", customers.get(3395).getEmail());
	}

	@Test
	@DisplayName("Record 3396: Web is http://www.margaritooehm.com")
	void WebOfRecord3396() {
		assertEquals("http://www.margaritooehm.com", customers.get(3395).getWeb());
	}
}
