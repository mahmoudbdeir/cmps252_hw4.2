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
class Record_207 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 207: FirstName is Aurora")
	void FirstNameOfRecord207() {
		assertEquals("Aurora", customers.get(206).getFirstName());
	}

	@Test
	@DisplayName("Record 207: LastName is Bulls")
	void LastNameOfRecord207() {
		assertEquals("Bulls", customers.get(206).getLastName());
	}

	@Test
	@DisplayName("Record 207: Company is National Migrant Resource Prgm")
	void CompanyOfRecord207() {
		assertEquals("National Migrant Resource Prgm", customers.get(206).getCompany());
	}

	@Test
	@DisplayName("Record 207: Address is Fm Rd  #-250")
	void AddressOfRecord207() {
		assertEquals("Fm Rd  #-250", customers.get(206).getAddress());
	}

	@Test
	@DisplayName("Record 207: City is Lone Star")
	void CityOfRecord207() {
		assertEquals("Lone Star", customers.get(206).getCity());
	}

	@Test
	@DisplayName("Record 207: County is Morris")
	void CountyOfRecord207() {
		assertEquals("Morris", customers.get(206).getCounty());
	}

	@Test
	@DisplayName("Record 207: State is TX")
	void StateOfRecord207() {
		assertEquals("TX", customers.get(206).getState());
	}

	@Test
	@DisplayName("Record 207: ZIP is 75668")
	void ZIPOfRecord207() {
		assertEquals("75668", customers.get(206).getZIP());
	}

	@Test
	@DisplayName("Record 207: Phone is 903-656-4924")
	void PhoneOfRecord207() {
		assertEquals("903-656-4924", customers.get(206).getPhone());
	}

	@Test
	@DisplayName("Record 207: Fax is 903-656-2401")
	void FaxOfRecord207() {
		assertEquals("903-656-2401", customers.get(206).getFax());
	}

	@Test
	@DisplayName("Record 207: Email is aurora@bulls.com")
	void EmailOfRecord207() {
		assertEquals("aurora@bulls.com", customers.get(206).getEmail());
	}

	@Test
	@DisplayName("Record 207: Web is http://www.aurorabulls.com")
	void WebOfRecord207() {
		assertEquals("http://www.aurorabulls.com", customers.get(206).getWeb());
	}
}
