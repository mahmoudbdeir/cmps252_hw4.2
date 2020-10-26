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
class Record_2482 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2482: FirstName is Annette")
	void FirstNameOfRecord2482() {
		assertEquals("Annette", customers.get(2481).getFirstName());
	}

	@Test
	@DisplayName("Record 2482: LastName is Enrriquez")
	void LastNameOfRecord2482() {
		assertEquals("Enrriquez", customers.get(2481).getLastName());
	}

	@Test
	@DisplayName("Record 2482: Company is Creatv Modeling & Die Mfg Co")
	void CompanyOfRecord2482() {
		assertEquals("Creatv Modeling & Die Mfg Co", customers.get(2481).getCompany());
	}

	@Test
	@DisplayName("Record 2482: Address is 415 Mill Pond Ln")
	void AddressOfRecord2482() {
		assertEquals("415 Mill Pond Ln", customers.get(2481).getAddress());
	}

	@Test
	@DisplayName("Record 2482: City is Brighton")
	void CityOfRecord2482() {
		assertEquals("Brighton", customers.get(2481).getCity());
	}

	@Test
	@DisplayName("Record 2482: County is Livingston")
	void CountyOfRecord2482() {
		assertEquals("Livingston", customers.get(2481).getCounty());
	}

	@Test
	@DisplayName("Record 2482: State is MI")
	void StateOfRecord2482() {
		assertEquals("MI", customers.get(2481).getState());
	}

	@Test
	@DisplayName("Record 2482: ZIP is 48116")
	void ZIPOfRecord2482() {
		assertEquals("48116", customers.get(2481).getZIP());
	}

	@Test
	@DisplayName("Record 2482: Phone is 810-227-6288")
	void PhoneOfRecord2482() {
		assertEquals("810-227-6288", customers.get(2481).getPhone());
	}

	@Test
	@DisplayName("Record 2482: Fax is 810-227-8956")
	void FaxOfRecord2482() {
		assertEquals("810-227-8956", customers.get(2481).getFax());
	}

	@Test
	@DisplayName("Record 2482: Email is annette@enrriquez.com")
	void EmailOfRecord2482() {
		assertEquals("annette@enrriquez.com", customers.get(2481).getEmail());
	}

	@Test
	@DisplayName("Record 2482: Web is http://www.annetteenrriquez.com")
	void WebOfRecord2482() {
		assertEquals("http://www.annetteenrriquez.com", customers.get(2481).getWeb());
	}
}
