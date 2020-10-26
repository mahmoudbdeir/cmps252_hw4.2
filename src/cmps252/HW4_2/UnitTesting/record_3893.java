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

@Tag("2")
class Record_3893 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3893: FirstName is Chauncey")
	void FirstNameOfRecord3893() {
		assertEquals("Chauncey", customers.get(3892).getFirstName());
	}

	@Test
	@DisplayName("Record 3893: LastName is Masias")
	void LastNameOfRecord3893() {
		assertEquals("Masias", customers.get(3892).getLastName());
	}

	@Test
	@DisplayName("Record 3893: Company is Smith, Michael J Md")
	void CompanyOfRecord3893() {
		assertEquals("Smith, Michael J Md", customers.get(3892).getCompany());
	}

	@Test
	@DisplayName("Record 3893: Address is 1501 Myrtle St")
	void AddressOfRecord3893() {
		assertEquals("1501 Myrtle St", customers.get(3892).getAddress());
	}

	@Test
	@DisplayName("Record 3893: City is Erie")
	void CityOfRecord3893() {
		assertEquals("Erie", customers.get(3892).getCity());
	}

	@Test
	@DisplayName("Record 3893: County is Erie")
	void CountyOfRecord3893() {
		assertEquals("Erie", customers.get(3892).getCounty());
	}

	@Test
	@DisplayName("Record 3893: State is PA")
	void StateOfRecord3893() {
		assertEquals("PA", customers.get(3892).getState());
	}

	@Test
	@DisplayName("Record 3893: ZIP is 16502")
	void ZIPOfRecord3893() {
		assertEquals("16502", customers.get(3892).getZIP());
	}

	@Test
	@DisplayName("Record 3893: Phone is 814-456-3530")
	void PhoneOfRecord3893() {
		assertEquals("814-456-3530", customers.get(3892).getPhone());
	}

	@Test
	@DisplayName("Record 3893: Fax is 814-456-5645")
	void FaxOfRecord3893() {
		assertEquals("814-456-5645", customers.get(3892).getFax());
	}

	@Test
	@DisplayName("Record 3893: Email is chauncey@masias.com")
	void EmailOfRecord3893() {
		assertEquals("chauncey@masias.com", customers.get(3892).getEmail());
	}

	@Test
	@DisplayName("Record 3893: Web is http://www.chaunceymasias.com")
	void WebOfRecord3893() {
		assertEquals("http://www.chaunceymasias.com", customers.get(3892).getWeb());
	}
}
