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
class Record_2622 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2622: FirstName is Hilda")
	void FirstNameOfRecord2622() {
		assertEquals("Hilda", customers.get(2621).getFirstName());
	}

	@Test
	@DisplayName("Record 2622: LastName is Cavins")
	void LastNameOfRecord2622() {
		assertEquals("Cavins", customers.get(2621).getLastName());
	}

	@Test
	@DisplayName("Record 2622: Company is Matrx Medical Inc")
	void CompanyOfRecord2622() {
		assertEquals("Matrx Medical Inc", customers.get(2621).getCompany());
	}

	@Test
	@DisplayName("Record 2622: Address is 3017 Morgan Ave")
	void AddressOfRecord2622() {
		assertEquals("3017 Morgan Ave", customers.get(2621).getAddress());
	}

	@Test
	@DisplayName("Record 2622: City is Corpus Christi")
	void CityOfRecord2622() {
		assertEquals("Corpus Christi", customers.get(2621).getCity());
	}

	@Test
	@DisplayName("Record 2622: County is Nueces")
	void CountyOfRecord2622() {
		assertEquals("Nueces", customers.get(2621).getCounty());
	}

	@Test
	@DisplayName("Record 2622: State is TX")
	void StateOfRecord2622() {
		assertEquals("TX", customers.get(2621).getState());
	}

	@Test
	@DisplayName("Record 2622: ZIP is 78405")
	void ZIPOfRecord2622() {
		assertEquals("78405", customers.get(2621).getZIP());
	}

	@Test
	@DisplayName("Record 2622: Phone is 361-884-9951")
	void PhoneOfRecord2622() {
		assertEquals("361-884-9951", customers.get(2621).getPhone());
	}

	@Test
	@DisplayName("Record 2622: Fax is 361-884-7897")
	void FaxOfRecord2622() {
		assertEquals("361-884-7897", customers.get(2621).getFax());
	}

	@Test
	@DisplayName("Record 2622: Email is hilda@cavins.com")
	void EmailOfRecord2622() {
		assertEquals("hilda@cavins.com", customers.get(2621).getEmail());
	}

	@Test
	@DisplayName("Record 2622: Web is http://www.hildacavins.com")
	void WebOfRecord2622() {
		assertEquals("http://www.hildacavins.com", customers.get(2621).getWeb());
	}
}
