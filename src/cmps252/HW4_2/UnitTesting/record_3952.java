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

@Tag("44")
class Record_3952 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3952: FirstName is Jarrett")
	void FirstNameOfRecord3952() {
		assertEquals("Jarrett", customers.get(3951).getFirstName());
	}

	@Test
	@DisplayName("Record 3952: LastName is Osario")
	void LastNameOfRecord3952() {
		assertEquals("Osario", customers.get(3951).getLastName());
	}

	@Test
	@DisplayName("Record 3952: Company is Mcquillan, Elizabeth M Esq")
	void CompanyOfRecord3952() {
		assertEquals("Mcquillan, Elizabeth M Esq", customers.get(3951).getCompany());
	}

	@Test
	@DisplayName("Record 3952: Address is Beauty Shop  #-2401")
	void AddressOfRecord3952() {
		assertEquals("Beauty Shop  #-2401", customers.get(3951).getAddress());
	}

	@Test
	@DisplayName("Record 3952: City is Aberdeen")
	void CityOfRecord3952() {
		assertEquals("Aberdeen", customers.get(3951).getCity());
	}

	@Test
	@DisplayName("Record 3952: County is Harford")
	void CountyOfRecord3952() {
		assertEquals("Harford", customers.get(3951).getCounty());
	}

	@Test
	@DisplayName("Record 3952: State is MD")
	void StateOfRecord3952() {
		assertEquals("MD", customers.get(3951).getState());
	}

	@Test
	@DisplayName("Record 3952: ZIP is 21001")
	void ZIPOfRecord3952() {
		assertEquals("21001", customers.get(3951).getZIP());
	}

	@Test
	@DisplayName("Record 3952: Phone is 410-272-6167")
	void PhoneOfRecord3952() {
		assertEquals("410-272-6167", customers.get(3951).getPhone());
	}

	@Test
	@DisplayName("Record 3952: Fax is 410-272-7261")
	void FaxOfRecord3952() {
		assertEquals("410-272-7261", customers.get(3951).getFax());
	}

	@Test
	@DisplayName("Record 3952: Email is jarrett@osario.com")
	void EmailOfRecord3952() {
		assertEquals("jarrett@osario.com", customers.get(3951).getEmail());
	}

	@Test
	@DisplayName("Record 3952: Web is http://www.jarrettosario.com")
	void WebOfRecord3952() {
		assertEquals("http://www.jarrettosario.com", customers.get(3951).getWeb());
	}
}
