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
class Record_3295 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3295: FirstName is Charmaine")
	void FirstNameOfRecord3295() {
		assertEquals("Charmaine", customers.get(3294).getFirstName());
	}

	@Test
	@DisplayName("Record 3295: LastName is Guerrieri")
	void LastNameOfRecord3295() {
		assertEquals("Guerrieri", customers.get(3294).getLastName());
	}

	@Test
	@DisplayName("Record 3295: Company is Schnetsler & Strealy")
	void CompanyOfRecord3295() {
		assertEquals("Schnetsler & Strealy", customers.get(3294).getCompany());
	}

	@Test
	@DisplayName("Record 3295: Address is 994 Madison Ave")
	void AddressOfRecord3295() {
		assertEquals("994 Madison Ave", customers.get(3294).getAddress());
	}

	@Test
	@DisplayName("Record 3295: City is Paterson")
	void CityOfRecord3295() {
		assertEquals("Paterson", customers.get(3294).getCity());
	}

	@Test
	@DisplayName("Record 3295: County is Passaic")
	void CountyOfRecord3295() {
		assertEquals("Passaic", customers.get(3294).getCounty());
	}

	@Test
	@DisplayName("Record 3295: State is NJ")
	void StateOfRecord3295() {
		assertEquals("NJ", customers.get(3294).getState());
	}

	@Test
	@DisplayName("Record 3295: ZIP is 7501")
	void ZIPOfRecord3295() {
		assertEquals("7501", customers.get(3294).getZIP());
	}

	@Test
	@DisplayName("Record 3295: Phone is 973-742-1601")
	void PhoneOfRecord3295() {
		assertEquals("973-742-1601", customers.get(3294).getPhone());
	}

	@Test
	@DisplayName("Record 3295: Fax is 973-742-3717")
	void FaxOfRecord3295() {
		assertEquals("973-742-3717", customers.get(3294).getFax());
	}

	@Test
	@DisplayName("Record 3295: Email is charmaine@guerrieri.com")
	void EmailOfRecord3295() {
		assertEquals("charmaine@guerrieri.com", customers.get(3294).getEmail());
	}

	@Test
	@DisplayName("Record 3295: Web is http://www.charmaineguerrieri.com")
	void WebOfRecord3295() {
		assertEquals("http://www.charmaineguerrieri.com", customers.get(3294).getWeb());
	}
}
