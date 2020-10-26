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
class Record_3793 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3793: FirstName is Allison")
	void FirstNameOfRecord3793() {
		assertEquals("Allison", customers.get(3792).getFirstName());
	}

	@Test
	@DisplayName("Record 3793: LastName is Conway")
	void LastNameOfRecord3793() {
		assertEquals("Conway", customers.get(3792).getLastName());
	}

	@Test
	@DisplayName("Record 3793: Company is Wright, Steven F Esq")
	void CompanyOfRecord3793() {
		assertEquals("Wright, Steven F Esq", customers.get(3792).getCompany());
	}

	@Test
	@DisplayName("Record 3793: Address is 1783 Revere Beach Pky")
	void AddressOfRecord3793() {
		assertEquals("1783 Revere Beach Pky", customers.get(3792).getAddress());
	}

	@Test
	@DisplayName("Record 3793: City is Everett")
	void CityOfRecord3793() {
		assertEquals("Everett", customers.get(3792).getCity());
	}

	@Test
	@DisplayName("Record 3793: County is Middlesex")
	void CountyOfRecord3793() {
		assertEquals("Middlesex", customers.get(3792).getCounty());
	}

	@Test
	@DisplayName("Record 3793: State is MA")
	void StateOfRecord3793() {
		assertEquals("MA", customers.get(3792).getState());
	}

	@Test
	@DisplayName("Record 3793: ZIP is 2149")
	void ZIPOfRecord3793() {
		assertEquals("2149", customers.get(3792).getZIP());
	}

	@Test
	@DisplayName("Record 3793: Phone is 617-389-1961")
	void PhoneOfRecord3793() {
		assertEquals("617-389-1961", customers.get(3792).getPhone());
	}

	@Test
	@DisplayName("Record 3793: Fax is 617-389-1091")
	void FaxOfRecord3793() {
		assertEquals("617-389-1091", customers.get(3792).getFax());
	}

	@Test
	@DisplayName("Record 3793: Email is allison@conway.com")
	void EmailOfRecord3793() {
		assertEquals("allison@conway.com", customers.get(3792).getEmail());
	}

	@Test
	@DisplayName("Record 3793: Web is http://www.allisonconway.com")
	void WebOfRecord3793() {
		assertEquals("http://www.allisonconway.com", customers.get(3792).getWeb());
	}
}
