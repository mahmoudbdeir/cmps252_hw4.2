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

@Tag("17")
class Record_3376 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3376: FirstName is Lavonne")
	void FirstNameOfRecord3376() {
		assertEquals("Lavonne", customers.get(3375).getFirstName());
	}

	@Test
	@DisplayName("Record 3376: LastName is Behrenwald")
	void LastNameOfRecord3376() {
		assertEquals("Behrenwald", customers.get(3375).getLastName());
	}

	@Test
	@DisplayName("Record 3376: Company is Sheraton New Orleans Hotel")
	void CompanyOfRecord3376() {
		assertEquals("Sheraton New Orleans Hotel", customers.get(3375).getCompany());
	}

	@Test
	@DisplayName("Record 3376: Address is 10 Boulder Crescent St  #-300d")
	void AddressOfRecord3376() {
		assertEquals("10 Boulder Crescent St  #-300d", customers.get(3375).getAddress());
	}

	@Test
	@DisplayName("Record 3376: City is Colorado Springs")
	void CityOfRecord3376() {
		assertEquals("Colorado Springs", customers.get(3375).getCity());
	}

	@Test
	@DisplayName("Record 3376: County is El Paso")
	void CountyOfRecord3376() {
		assertEquals("El Paso", customers.get(3375).getCounty());
	}

	@Test
	@DisplayName("Record 3376: State is CO")
	void StateOfRecord3376() {
		assertEquals("CO", customers.get(3375).getState());
	}

	@Test
	@DisplayName("Record 3376: ZIP is 80903")
	void ZIPOfRecord3376() {
		assertEquals("80903", customers.get(3375).getZIP());
	}

	@Test
	@DisplayName("Record 3376: Phone is 719-632-4897")
	void PhoneOfRecord3376() {
		assertEquals("719-632-4897", customers.get(3375).getPhone());
	}

	@Test
	@DisplayName("Record 3376: Fax is 719-632-1037")
	void FaxOfRecord3376() {
		assertEquals("719-632-1037", customers.get(3375).getFax());
	}

	@Test
	@DisplayName("Record 3376: Email is lavonne@behrenwald.com")
	void EmailOfRecord3376() {
		assertEquals("lavonne@behrenwald.com", customers.get(3375).getEmail());
	}

	@Test
	@DisplayName("Record 3376: Web is http://www.lavonnebehrenwald.com")
	void WebOfRecord3376() {
		assertEquals("http://www.lavonnebehrenwald.com", customers.get(3375).getWeb());
	}
}
