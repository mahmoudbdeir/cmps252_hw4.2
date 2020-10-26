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

@Tag("8")
class Record_3654 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3654: FirstName is Silas")
	void FirstNameOfRecord3654() {
		assertEquals("Silas", customers.get(3653).getFirstName());
	}

	@Test
	@DisplayName("Record 3654: LastName is Rowan")
	void LastNameOfRecord3654() {
		assertEquals("Rowan", customers.get(3653).getLastName());
	}

	@Test
	@DisplayName("Record 3654: Company is Boy Scouts Of America")
	void CompanyOfRecord3654() {
		assertEquals("Boy Scouts Of America", customers.get(3653).getCompany());
	}

	@Test
	@DisplayName("Record 3654: Address is 2907 Lycoming Creek Rd")
	void AddressOfRecord3654() {
		assertEquals("2907 Lycoming Creek Rd", customers.get(3653).getAddress());
	}

	@Test
	@DisplayName("Record 3654: City is Williamsport")
	void CityOfRecord3654() {
		assertEquals("Williamsport", customers.get(3653).getCity());
	}

	@Test
	@DisplayName("Record 3654: County is Lycoming")
	void CountyOfRecord3654() {
		assertEquals("Lycoming", customers.get(3653).getCounty());
	}

	@Test
	@DisplayName("Record 3654: State is PA")
	void StateOfRecord3654() {
		assertEquals("PA", customers.get(3653).getState());
	}

	@Test
	@DisplayName("Record 3654: ZIP is 17701")
	void ZIPOfRecord3654() {
		assertEquals("17701", customers.get(3653).getZIP());
	}

	@Test
	@DisplayName("Record 3654: Phone is 570-494-1644")
	void PhoneOfRecord3654() {
		assertEquals("570-494-1644", customers.get(3653).getPhone());
	}

	@Test
	@DisplayName("Record 3654: Fax is 570-494-4494")
	void FaxOfRecord3654() {
		assertEquals("570-494-4494", customers.get(3653).getFax());
	}

	@Test
	@DisplayName("Record 3654: Email is silas@rowan.com")
	void EmailOfRecord3654() {
		assertEquals("silas@rowan.com", customers.get(3653).getEmail());
	}

	@Test
	@DisplayName("Record 3654: Web is http://www.silasrowan.com")
	void WebOfRecord3654() {
		assertEquals("http://www.silasrowan.com", customers.get(3653).getWeb());
	}
}
