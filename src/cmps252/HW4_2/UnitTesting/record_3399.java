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

@Tag("28")
class Record_3399 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3399: FirstName is Rena")
	void FirstNameOfRecord3399() {
		assertEquals("Rena", customers.get(3398).getFirstName());
	}

	@Test
	@DisplayName("Record 3399: LastName is Palovick")
	void LastNameOfRecord3399() {
		assertEquals("Palovick", customers.get(3398).getLastName());
	}

	@Test
	@DisplayName("Record 3399: Company is Holiday Inn East")
	void CompanyOfRecord3399() {
		assertEquals("Holiday Inn East", customers.get(3398).getCompany());
	}

	@Test
	@DisplayName("Record 3399: Address is 610 Customs Dr")
	void AddressOfRecord3399() {
		assertEquals("610 Customs Dr", customers.get(3398).getAddress());
	}

	@Test
	@DisplayName("Record 3399: City is El Paso")
	void CityOfRecord3399() {
		assertEquals("El Paso", customers.get(3398).getCity());
	}

	@Test
	@DisplayName("Record 3399: County is El Paso")
	void CountyOfRecord3399() {
		assertEquals("El Paso", customers.get(3398).getCounty());
	}

	@Test
	@DisplayName("Record 3399: State is TX")
	void StateOfRecord3399() {
		assertEquals("TX", customers.get(3398).getState());
	}

	@Test
	@DisplayName("Record 3399: ZIP is 79905")
	void ZIPOfRecord3399() {
		assertEquals("79905", customers.get(3398).getZIP());
	}

	@Test
	@DisplayName("Record 3399: Phone is 915-542-3153")
	void PhoneOfRecord3399() {
		assertEquals("915-542-3153", customers.get(3398).getPhone());
	}

	@Test
	@DisplayName("Record 3399: Fax is 915-542-4314")
	void FaxOfRecord3399() {
		assertEquals("915-542-4314", customers.get(3398).getFax());
	}

	@Test
	@DisplayName("Record 3399: Email is rena@palovick.com")
	void EmailOfRecord3399() {
		assertEquals("rena@palovick.com", customers.get(3398).getEmail());
	}

	@Test
	@DisplayName("Record 3399: Web is http://www.renapalovick.com")
	void WebOfRecord3399() {
		assertEquals("http://www.renapalovick.com", customers.get(3398).getWeb());
	}
}
