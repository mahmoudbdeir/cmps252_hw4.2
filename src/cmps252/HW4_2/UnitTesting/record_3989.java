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

@Tag("22")
class Record_3989 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3989: FirstName is Alexander")
	void FirstNameOfRecord3989() {
		assertEquals("Alexander", customers.get(3988).getFirstName());
	}

	@Test
	@DisplayName("Record 3989: LastName is Ingegneri")
	void LastNameOfRecord3989() {
		assertEquals("Ingegneri", customers.get(3988).getLastName());
	}

	@Test
	@DisplayName("Record 3989: Company is J Mulcahy Bernard Co Inc")
	void CompanyOfRecord3989() {
		assertEquals("J Mulcahy Bernard Co Inc", customers.get(3988).getCompany());
	}

	@Test
	@DisplayName("Record 3989: Address is 2955 Felton Rd")
	void AddressOfRecord3989() {
		assertEquals("2955 Felton Rd", customers.get(3988).getAddress());
	}

	@Test
	@DisplayName("Record 3989: City is Norristown")
	void CityOfRecord3989() {
		assertEquals("Norristown", customers.get(3988).getCity());
	}

	@Test
	@DisplayName("Record 3989: County is Montgomery")
	void CountyOfRecord3989() {
		assertEquals("Montgomery", customers.get(3988).getCounty());
	}

	@Test
	@DisplayName("Record 3989: State is PA")
	void StateOfRecord3989() {
		assertEquals("PA", customers.get(3988).getState());
	}

	@Test
	@DisplayName("Record 3989: ZIP is 19401")
	void ZIPOfRecord3989() {
		assertEquals("19401", customers.get(3988).getZIP());
	}

	@Test
	@DisplayName("Record 3989: Phone is 610-275-1867")
	void PhoneOfRecord3989() {
		assertEquals("610-275-1867", customers.get(3988).getPhone());
	}

	@Test
	@DisplayName("Record 3989: Fax is 610-275-5946")
	void FaxOfRecord3989() {
		assertEquals("610-275-5946", customers.get(3988).getFax());
	}

	@Test
	@DisplayName("Record 3989: Email is alexander@ingegneri.com")
	void EmailOfRecord3989() {
		assertEquals("alexander@ingegneri.com", customers.get(3988).getEmail());
	}

	@Test
	@DisplayName("Record 3989: Web is http://www.alexanderingegneri.com")
	void WebOfRecord3989() {
		assertEquals("http://www.alexanderingegneri.com", customers.get(3988).getWeb());
	}
}
