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

@Tag("23")
class Record_3891 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3891: FirstName is Demetria")
	void FirstNameOfRecord3891() {
		assertEquals("Demetria", customers.get(3890).getFirstName());
	}

	@Test
	@DisplayName("Record 3891: LastName is Pennella")
	void LastNameOfRecord3891() {
		assertEquals("Pennella", customers.get(3890).getLastName());
	}

	@Test
	@DisplayName("Record 3891: Company is Ceres Pipe & Metal")
	void CompanyOfRecord3891() {
		assertEquals("Ceres Pipe & Metal", customers.get(3890).getCompany());
	}

	@Test
	@DisplayName("Record 3891: Address is 905 Aturnpike")
	void AddressOfRecord3891() {
		assertEquals("905 Aturnpike", customers.get(3890).getAddress());
	}

	@Test
	@DisplayName("Record 3891: City is Canton")
	void CityOfRecord3891() {
		assertEquals("Canton", customers.get(3890).getCity());
	}

	@Test
	@DisplayName("Record 3891: County is Norfolk")
	void CountyOfRecord3891() {
		assertEquals("Norfolk", customers.get(3890).getCounty());
	}

	@Test
	@DisplayName("Record 3891: State is MA")
	void StateOfRecord3891() {
		assertEquals("MA", customers.get(3890).getState());
	}

	@Test
	@DisplayName("Record 3891: ZIP is 2021")
	void ZIPOfRecord3891() {
		assertEquals("2021", customers.get(3890).getZIP());
	}

	@Test
	@DisplayName("Record 3891: Phone is 781-821-2905")
	void PhoneOfRecord3891() {
		assertEquals("781-821-2905", customers.get(3890).getPhone());
	}

	@Test
	@DisplayName("Record 3891: Fax is 781-821-3729")
	void FaxOfRecord3891() {
		assertEquals("781-821-3729", customers.get(3890).getFax());
	}

	@Test
	@DisplayName("Record 3891: Email is demetria@pennella.com")
	void EmailOfRecord3891() {
		assertEquals("demetria@pennella.com", customers.get(3890).getEmail());
	}

	@Test
	@DisplayName("Record 3891: Web is http://www.demetriapennella.com")
	void WebOfRecord3891() {
		assertEquals("http://www.demetriapennella.com", customers.get(3890).getWeb());
	}
}
