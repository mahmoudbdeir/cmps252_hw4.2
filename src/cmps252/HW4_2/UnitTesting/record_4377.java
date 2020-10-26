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

@Tag("16")
class Record_4377 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4377: FirstName is Ignacio")
	void FirstNameOfRecord4377() {
		assertEquals("Ignacio", customers.get(4376).getFirstName());
	}

	@Test
	@DisplayName("Record 4377: LastName is Malagon")
	void LastNameOfRecord4377() {
		assertEquals("Malagon", customers.get(4376).getLastName());
	}

	@Test
	@DisplayName("Record 4377: Company is beamac International")
	void CompanyOfRecord4377() {
		assertEquals("beamac International", customers.get(4376).getCompany());
	}

	@Test
	@DisplayName("Record 4377: Address is 2525 S Telshor Blvd")
	void AddressOfRecord4377() {
		assertEquals("2525 S Telshor Blvd", customers.get(4376).getAddress());
	}

	@Test
	@DisplayName("Record 4377: City is Las Cruces")
	void CityOfRecord4377() {
		assertEquals("Las Cruces", customers.get(4376).getCity());
	}

	@Test
	@DisplayName("Record 4377: County is Dona Ana")
	void CountyOfRecord4377() {
		assertEquals("Dona Ana", customers.get(4376).getCounty());
	}

	@Test
	@DisplayName("Record 4377: State is NM")
	void StateOfRecord4377() {
		assertEquals("NM", customers.get(4376).getState());
	}

	@Test
	@DisplayName("Record 4377: ZIP is 88011")
	void ZIPOfRecord4377() {
		assertEquals("88011", customers.get(4376).getZIP());
	}

	@Test
	@DisplayName("Record 4377: Phone is 505-522-4032")
	void PhoneOfRecord4377() {
		assertEquals("505-522-4032", customers.get(4376).getPhone());
	}

	@Test
	@DisplayName("Record 4377: Fax is 505-522-4796")
	void FaxOfRecord4377() {
		assertEquals("505-522-4796", customers.get(4376).getFax());
	}

	@Test
	@DisplayName("Record 4377: Email is ignacio@malagon.com")
	void EmailOfRecord4377() {
		assertEquals("ignacio@malagon.com", customers.get(4376).getEmail());
	}

	@Test
	@DisplayName("Record 4377: Web is http://www.ignaciomalagon.com")
	void WebOfRecord4377() {
		assertEquals("http://www.ignaciomalagon.com", customers.get(4376).getWeb());
	}
}
