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

@Tag("34")
class Record_4279 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4279: FirstName is Demetria")
	void FirstNameOfRecord4279() {
		assertEquals("Demetria", customers.get(4278).getFirstName());
	}

	@Test
	@DisplayName("Record 4279: LastName is Kloberdanz")
	void LastNameOfRecord4279() {
		assertEquals("Kloberdanz", customers.get(4278).getLastName());
	}

	@Test
	@DisplayName("Record 4279: Company is Rosenwald, Peter B Ii")
	void CompanyOfRecord4279() {
		assertEquals("Rosenwald, Peter B Ii", customers.get(4278).getCompany());
	}

	@Test
	@DisplayName("Record 4279: Address is 1650 Market St  #-3100")
	void AddressOfRecord4279() {
		assertEquals("1650 Market St  #-3100", customers.get(4278).getAddress());
	}

	@Test
	@DisplayName("Record 4279: City is Philadelphia")
	void CityOfRecord4279() {
		assertEquals("Philadelphia", customers.get(4278).getCity());
	}

	@Test
	@DisplayName("Record 4279: County is Philadelphia")
	void CountyOfRecord4279() {
		assertEquals("Philadelphia", customers.get(4278).getCounty());
	}

	@Test
	@DisplayName("Record 4279: State is PA")
	void StateOfRecord4279() {
		assertEquals("PA", customers.get(4278).getState());
	}

	@Test
	@DisplayName("Record 4279: ZIP is 19103")
	void ZIPOfRecord4279() {
		assertEquals("19103", customers.get(4278).getZIP());
	}

	@Test
	@DisplayName("Record 4279: Phone is 215-587-3220")
	void PhoneOfRecord4279() {
		assertEquals("215-587-3220", customers.get(4278).getPhone());
	}

	@Test
	@DisplayName("Record 4279: Fax is 215-587-7231")
	void FaxOfRecord4279() {
		assertEquals("215-587-7231", customers.get(4278).getFax());
	}

	@Test
	@DisplayName("Record 4279: Email is demetria@kloberdanz.com")
	void EmailOfRecord4279() {
		assertEquals("demetria@kloberdanz.com", customers.get(4278).getEmail());
	}

	@Test
	@DisplayName("Record 4279: Web is http://www.demetriakloberdanz.com")
	void WebOfRecord4279() {
		assertEquals("http://www.demetriakloberdanz.com", customers.get(4278).getWeb());
	}
}
